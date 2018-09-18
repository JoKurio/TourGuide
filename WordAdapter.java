package io.github.jokurio.tourguide;

import android.widget.ArrayAdapter;
import android.support.v4.content.ContextCompat;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorResourceId;


    public WordAdapter(Context context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        TextView locationDetailsView = listItemView.findViewById(R.id.location_details);
        locationDetailsView.setText(currentWord.getlocationDetailsId());

        TextView locationNameView = listItemView.findViewById(R.id.location_name);

        locationNameView.setText(currentWord.getlocationNameId());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView =  listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentWord.getImageResourceId());
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);
        return listItemView;
    }

}
