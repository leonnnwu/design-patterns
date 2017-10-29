package com.lwu.iterator;

import java.util.List;

public class TreasureChestItemIterator implements ItemIterator {

    private TreasureChest chest;
    private int idx;
    private ItemType type;

    public TreasureChestItemIterator(TreasureChest chest, ItemType type) {
        this.chest = chest;
        this.type = type;
        this.idx = -1;
    }

    @Override
    public boolean hasNext() {
        return findNextIdx() != -1;
    }

    @Override
    public Item next() {
        if (hasNext()) {
            return chest.getItems().get(idx);
        }

        return null;
    }

    private int findNextIdx() {
        List<Item> items = chest.getItems();
        int result = -1;
        for (int i=idx; i<items.size(); i++) {
            if (type == ItemType.ANY || type == items.get(i).getType()) {
                result = i;
                break;
            }
        }

        return result;
    }
}
