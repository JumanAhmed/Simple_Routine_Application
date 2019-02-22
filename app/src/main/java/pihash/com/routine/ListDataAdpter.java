package pihash.com.routine;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Juman on 1/20/2016.
 */
public class ListDataAdpter extends ArrayAdapter {

    List list = new ArrayList();
    public ListDataAdpter(Context context, int resource) {
        super(context, resource);
    }

    class LayoutHandeler{
        TextView className,time,room,feculty;
    }
    @Override
    public void add(Object object) {
        super.add(object);
        list.add(object);
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
    public View getView(int position, View convertView, ViewGroup parent) {

        View view= convertView;
        LayoutHandeler layoutHandeler;

        if (view == null)
        {
            LayoutInflater layoutInflater= (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.contactlistview,parent,false);
            layoutHandeler = new LayoutHandeler();

            layoutHandeler.className = (TextView) view.findViewById(R.id.tvclass);
            layoutHandeler.time= (TextView) view.findViewById(R.id.tvTime);
            layoutHandeler.room= (TextView) view.findViewById(R.id.tvroom);
            layoutHandeler.feculty= (TextView) view.findViewById(R.id.tvfeculty);




            view.setTag(layoutHandeler);

        }else {
            layoutHandeler = (LayoutHandeler) view.getTag();
        }

        ContactInfo contactInfo = (ContactInfo) this.getItem(position);
        layoutHandeler.className.setText(contactInfo.getClassN());
        layoutHandeler.time.setText(contactInfo.getTime());
        layoutHandeler.room.setText(contactInfo.getRoomNo());
        layoutHandeler.feculty.setText(contactInfo.getFeculty());



        return view;
    }
}
