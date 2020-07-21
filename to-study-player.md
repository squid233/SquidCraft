# update to fabric mod development  

Check whether the folder exists 检测文件夹是否存在  
File config = new File("config");// List a new folder 列举一个新的文件夹  
used if to realization： !config.exists() && config.isDirectory()  if boolen is true then config.mkdir();  
Note: check the existence of folders one by one 注意：文件夹要一个一个检查是否存在  