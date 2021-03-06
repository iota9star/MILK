package g.star.iota.milk.ui.lingyu.ling;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import g.star.iota.milk.R;
import g.star.iota.milk.base.BaseAdapter;


public class LingYuAdapter extends BaseAdapter<LingYuViewHolder, LingYuBean> {

    @Override
    public LingYuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new LingYuViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_description_with_tag, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((LingYuViewHolder) holder).bindView(mBeans.get(position));
    }
}
