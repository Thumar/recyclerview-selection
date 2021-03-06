package com.androidkt.recyclerviewselection.adapter;

import androidx.annotation.Nullable;

import com.androidkt.recyclerviewselection.model.Item;

import androidx.recyclerview.selection.ItemDetailsLookup;

/**
 * Created by brijesh on 27/3/18.
 */

public class MyItemDetail extends ItemDetailsLookup.ItemDetails {
    private final int adapterPosition;
    private final Item selectionKey;

    public MyItemDetail(int adapterPosition, Item selectionKey) {
        this.adapterPosition = adapterPosition;
        this.selectionKey = selectionKey;
    }

    @Override
    public int getPosition() {
        return adapterPosition;
    }

    @Nullable
    @Override
    public Object getSelectionKey() {
        return selectionKey;
    }
}
