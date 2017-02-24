package com.app.taoxin.adapter;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.TextView;

import com.app.taoxin.R;
import com.app.taoxin.model.GanHuo;
import com.app.taoxin.util.TimeUtil;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;


class GanHuoViewHolder extends BaseViewHolder<GanHuo.Result> {
    private TextView title;
    private TextView type;
    private TextView who;
    private TextView time;

    GanHuoViewHolder(ViewGroup parent) {
        super(parent, R.layout.ganhuo_item);
        title = $(R.id.title);
        type = $(R.id.type);
        who = $(R.id.who);
        time = $(R.id.time);
    }

    @Override
    public void setData(GanHuo.Result data) {
        super.setData(data);
        //标题
        title.setText(data.getDesc());
        //干货类型
        type.setText(data.getType());
        //根据干货类型动态替换干货图标
        switch (data.getType()){
            case "Android":
                setDrawableLeft(R.drawable.ic_android_black_24dp);
                break;
            case "iOS":
                setDrawableLeft(R.drawable.ic_whatshot_black_24dp);
                break;
            case "前端":
                setDrawableLeft(R.drawable.ic_play_circle_filled_black_24dp);
                break;
            case "休息视频":
                setDrawableLeft(R.drawable.ic_whatshot_black_24dp);
                break;
        }
        //干货贡献者
        who.setText(data.getWho());
        //干货提交时间
        time.setText(TimeUtil.getFormatTime(data.getPublishedAt()));
    }

    private void setDrawableLeft(int imageId){
        Drawable drawable = getContext().getResources().getDrawable(imageId);
        drawable.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
        type.setCompoundDrawables(drawable,null,null,null);
    }
}
