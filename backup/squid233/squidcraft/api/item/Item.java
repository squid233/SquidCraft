package io.github.squid233.squidcraft.api.item;

import io.github.squid233.squidcraft.api.ItemRegistries;

/**
 * <h1>The item class</h1>
 * <p>The item class need with
 * {@linkplain ItemRegistries#registerAll(String, Item...)
 * registerAll(String modid, Item... items)} use.</p>
 * <h2>How to use</h2>
 * <ol>
 *     <li>The 1st method:</li>
 *     <p>
 *         <code>import io.github.squid233.squidcraft.api.item.Item;
 *         <br /><br />
 *         public class ExampleItem extends Item {<br>
 *         &nbsp;&nbsp;&nbsp;&nbsp;public ExampleItem(Settings settings) {<br>
 *         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;super(settings);<br>
 *         &nbsp;&nbsp;&nbsp;&nbsp;}<br>
 *         <span></span>@Override<br>
 *                public String getRegistryName() {<br>
 *         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return "example";<br>
 *         &nbsp;&nbsp;&nbsp;&nbsp;}<br>
 *         }
 *         </code>
 *     </p>
 *     <li>The 2nd method:</li>
 *     <p>
 *         <code>public static final String {@link Item} EXAMPLE_ITEM = new {@link Item}(new {@linkplain net.minecraft.item.Item.Settings Item.Settings()}){<span></span>@Override public String getRegistryName(){return "example";}}</code>
 *     </p>
 * </ol>
 */
public abstract class Item extends net.minecraft.item.Item {

    public Item(Settings settings) {
        super(settings);
    }

    /**
     * The registers will use the registry name.
     * @return a string.
     */
    public abstract String getRegistryName();

}
