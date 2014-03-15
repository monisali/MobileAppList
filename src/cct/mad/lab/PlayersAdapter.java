package cct.mad.lab;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayersAdapter extends ArrayAdapter<Players> {
	
	Context context;
	int layoutResourceId;
	Players data[] = null;
	
	public PlayersAdapter(Context context, int layoutResourceId, Players[] data) {
		super(context, layoutResourceId, data);
		this.layoutResourceId = layoutResourceId;
		this.context = context;
		this.data = data;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View row = convertView;
		PlayersHolder holder = null;
		
		if (row == null) {
			LayoutInflater inflater = ((Activity) context).getLayoutInflater();
			row = inflater.inflate(layoutResourceId, parent, false);
			
			holder = new PlayersHolder();
			holder.imgIcon = (ImageView)row.findViewById(R.id.imgIcon);
			holder.txtTitle = (TextView)row.findViewById(R.id.txtTitle);
			
			row.setTag(holder);
		}
		else {
			holder = (PlayersHolder)row.getTag();
		}
		
		Players players = data[position];
        holder.txtTitle.setText(players.title);
        holder.imgIcon.setImageResource(players.icon);
        
        return row;
		
	}
	
	static class PlayersHolder
    {
        ImageView imgIcon;
        TextView txtTitle;
    }
}


