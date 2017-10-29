package com.lwu.iterator;

import java.util.ArrayList;
import java.util.List;

public class TreasureChest {

    private List<Item> itemList = new ArrayList<>();

    public TreasureChest() {
        itemList.add(new Item(ItemType.POTION, "Potion of courage"));
        itemList.add(new Item(ItemType.RING, "Ring of shadows"));
        itemList.add(new Item(ItemType.POTION, "Potion of wisdom"));
        itemList.add(new Item(ItemType.POTION, "Potion of blood"));
        itemList.add(new Item(ItemType.WEAPON, "Sword of silver +1"));
        itemList.add(new Item(ItemType.POTION, "Potion of rust"));
        itemList.add(new Item(ItemType.POTION, "Potion of healing"));
        itemList.add(new Item(ItemType.RING, "Ring of armor"));
        itemList.add(new Item(ItemType.WEAPON, "Steel halberd"));
        itemList.add(new Item(ItemType.WEAPON, "Dagger of poison"));
    }

    ItemIterator iterator(ItemType itemType) {
        return new TreasureChestItemIterator(this, itemType);
    }

    public List<Item> getItems() {
        List<Item> list = new ArrayList<>();
        list.addAll(itemList);
        return list;
    }
}
