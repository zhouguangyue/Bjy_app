package app.wms.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

import app.wms.R;
import app.wms.empty.ViewHolder;
import app.wms.empty.XfQingDan;

/**
 * Created by zhou on 2016/9/20.
 */
public class ListViewAdapter extends BaseAdapter {
    private Context context;
    private List<XfQingDan> list;

    public ListViewAdapter(Context context,List<XfQingDan> list){
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView==null){
            convertView = View.inflate(this.context, R.layout.adapter_list,null);
            holder = new ViewHolder();
            holder.tv_qd_bianhao = (TextView) convertView.findViewById(R.id.tv_qd_c1);
            holder.tv_qd_name = (TextView) convertView.findViewById(R.id.tv_qd_c2);
            holder.tv_qd_shuliang = (TextView) convertView.findViewById(R.id.tv_qd_c3);
            holder.tv_qd_daishangjia = (TextView) convertView.findViewById(R.id.tv_qd_c4);
            holder.tv_qd_zhiliang = (TextView) convertView.findViewById(R.id.tv_qd_c5);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }

        holder.tv_qd_bianhao.setText(list.get(position).getTv_la_bianhao());
        holder.tv_qd_name.setText(list.get(position).getTv_la_name());
        holder.tv_qd_shuliang.setText(list.get(position).getTv_la_shuliang());
        holder.tv_qd_daishangjia.setText(list.get(position).getTv_la_dsj());
        holder.tv_qd_zhiliang.setText(list.get(position).getTv_la_zhiliang());

        return convertView;
    }



}
