package de.com.rost.fcap;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;


/**
 * Created by daniel on 27.12.2015.
 */

public class ContentListAdapter extends ArrayAdapter<Realty> {

    private Context context;
    private List<Realty> realtiesList;

    public ContentListAdapter(Context context, List<Realty> realtiesList) {

        super(context, R.layout.realties_list_item, realtiesList);
        this.context = context;
        this.realtiesList = realtiesList;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        ViewHolder holder;

        if(convertView == null){

            convertView = inflater.inflate(R.layout.realties_list_item, parent, false);
            holder = new ViewHolder();
            holder.name = (TextView) convertView.findViewById(R.id.nameTextView);
            holder.city = (TextView) convertView.findViewById(R.id.cityTextView);

            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        TextView realtyNameTextView = (TextView) convertView.findViewById(R.id.nameTextView);
        TextView cityTextView = (TextView) convertView.findViewById(R.id.cityTextView);
        realtyNameTextView.setText(realtiesList.get(position).getName());
        cityTextView.setText(realtiesList.get(position).getCity());
        return convertView;
    }

    private class ViewHolder {
        TextView name, city;
    }

}
