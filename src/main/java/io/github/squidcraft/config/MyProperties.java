package io.github.squidcraft.config;

import java.io.*;
import java.util.*;

/**
 * @author baka4n
 */
public class MyProperties extends Properties {
    private static final long serialVersionUID = 1L;
    private List<Object> keyList = new ArrayList<Object>();

    /**
     * 默认构造方法类
     */
    public MyProperties() {
    }
    public MyProperties(String path) {
        try {
            InputStream is = new FileInputStream(path);
            this.load(is);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("指定文件不存在！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 重写put方法类
     * @param key
     * @param value
     * @return KEY VALUE
     */
    @Override
    public synchronized Object put(Object key, Object value) {
        this.removeKeyIfExists(key);
        keyList.add(key);
        return super.put(key, value);
    }

    /**
     * 重写移除方法类
     * @param key
     * @return key
     */
    @Override
    public synchronized Object remove(Object key) {
        this.removeKeyIfExists(key);
        return super.remove(key);
    }

    /**
     * 检索指定key并删除
     * @param key
     */
    private void removeKeyIfExists(Object key) {
        keyList.remove(key);
    }

    /**
     * 获取properties 有序合集
     * @return keyList
     */
    public List<Object> getKeyList() {
        return keyList;
    }

    /**
     * 路径保存
     * @param path
     */
    public void store(String path) {
        this.store(path, "UTF-8");
    }

    /**
     * 保存到指定文件夹
     * @param path
     * @param charset
     */
    public void store(String path, String charset) {
        if (path != null && !"".equals(path)) {
            try {
                OutputStream os = new FileOutputStream(path);
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os, charset));
                this.store(bw, null);
                bw.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            throw new RuntimeException("存储路径不能为空!");
        }
    }

    /**
     * 重写keys法
     * @return
     */
    @Override
    public synchronized Enumeration<Object> keys() {
        return new EnumerationAdapter<Object>(keyList);
    }

    /**
     * 适配器
     * @param <T>
     */
    private class EnumerationAdapter<T> implements Enumeration<T> {
        private int index = 0;
        private final List<T> list;
        private final boolean isEmpty;

        public EnumerationAdapter(List<T> list) {
            this.list = list;
            this.isEmpty = list.isEmpty();
        }

        public boolean hasMoreElements() {
            return !isEmpty && index < list.size();
        }

        public T nextElement() {
            if (this.hasMoreElements()) {
                return list.get(index++);
            }
            return null;
        }

    }
}
