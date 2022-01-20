package dev.ogabek.java.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import dev.ogabek.java.R;
import dev.ogabek.java.model.Member;

public class MainAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context context;
    List<Member> members;

    public MainAdapter(Context context, List<Member> members) {
        this.context = context;
        this.members = members;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view_layout, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return members.size();
    }

    private class ItemViewHolder extends RecyclerView.ViewHolder {
        public ItemViewHolder(View view) {
            super(view);
        }
    }
}
