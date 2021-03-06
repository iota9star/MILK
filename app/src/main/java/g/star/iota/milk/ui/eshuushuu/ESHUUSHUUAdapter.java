package g.star.iota.milk.ui.eshuushuu;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import g.star.iota.milk.R;
import g.star.iota.milk.base.BaseAdapter;


public class ESHUUSHUUAdapter extends BaseAdapter<ESHUUSHUUViewHolder, ESHUUSHUUBean> {

    @Override
    public ESHUUSHUUViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ESHUUSHUUViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_with_tag, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((ESHUUSHUUViewHolder) holder).bindView(mBeans.get(position));
    }
}
