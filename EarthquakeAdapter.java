
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {
    public EarthquakeAdapter(Context context, ArrayList<Earthquake> resource) {
        super(context,0, resource);

    }
    public View getView(int position, View contextView,ViewGroup parent){
        View listview= contextView;
        if (listview!=null){
            listview = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        Earthquake curear = getItem(position);
        TextView mgvw = (TextView) listview.findViewById(R.id.mag);
        mgvw.setText(curear.getMagnitude());

        TextView lcvw = (TextView) listview.findViewById(R.id.city);
        lcvw.setText(curear.getLoc());
        TextView dtvw = (TextView) listview.findViewById(R.id.mag);
        dtvw.setText(curear.getDate());
        return  listview;
    }
}
