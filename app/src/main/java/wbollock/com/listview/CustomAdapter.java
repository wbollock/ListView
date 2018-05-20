package wbollock.com.listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class CustomAdapter extends ArrayAdapter<String>{
    public CustomAdapter(@NonNull Context context, String[] foods) {
        super(context,R.layout.custom_row, foods); // tell android that it needs to use custom row in this adapter
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) { // where we tell android how to layout the strings we passed in
        LayoutInflater buckysInflater = LayoutInflater.from(getContext());
        View customView = buckysInflater.inflate(R.layout.custom_row, parent, false);

        String singleFoodItem = getItem(position);
        TextView buckysText = (TextView) customView.findViewById(R.id.buckysText);
        ImageView buckysImage = (ImageView) customView.findViewById(R.id.buckysImage);

        buckysText.setText(singleFoodItem);
        buckysImage.setImageResource(R.mipmap.dice);
        return customView; // saying hey, use our customView
    }
}


