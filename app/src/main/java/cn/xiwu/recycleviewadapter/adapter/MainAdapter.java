package cn.xiwu.recycleviewadapter.adapter;

import android.content.Context;

import cn.xiwu.recycleviewadapter.adapter.base.BaseRecycleAdapter;
import cn.xiwu.recycleviewadapter.bean.Teacher;

/**
 * Created by xiwu on 2017/11/30.
 */

public class MainAdapter extends BaseRecycleAdapter<Teacher,TeacherHolder>
{
    public MainAdapter(Context context)
    {
        super(context);
    }

    @Override
    public int getLayoutId()
    {
        return TeacherHolder.getLayoutId();
    }

    @Override
    public void onBindItemHolder(TeacherHolder holder, int position)
    {
        holder.id.setText(mDataList.get(position).getId());
        holder.name.setText(mDataList.get(position).getName());
        holder.sub.setText(mDataList.get(position).getSub());
    }
}
