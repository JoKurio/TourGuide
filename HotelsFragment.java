package io.github.jokurio.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


import java.util.ArrayList;


public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word(R.string.first_hotel, R.string.loc_first_hotel, R.drawable.hotel_one));
        words.add(new Word(R.string.second_hotel, R.string.loc_second_hotel, R.drawable.hotel_two));
        words.add(new Word(R.string.third_hotel, R.string.loc_third_hotel, R.drawable.hotel_six));
        words.add(new Word(R.string.fourth_hotel, R.string.loc_fourth_hotel, R.drawable.hotel_four));
        words.add(new Word(R.string.fifth_hotel, R.string.loc_fifth_hotel, R.drawable.hotel_five));
        words.add(new Word(R.string.sixth_hotel, R.string.loc_sixth_hotel, R.drawable.hotel_six));
        words.add(new Word(R.string.seventh_hotel, R.string.loc_seventh_hotel, R.drawable.hotel_seven));
        words.add(new Word(R.string.eighth_hotel, R.string.loc_eighth_hotel, R.drawable.hotel_eight));

        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.hotels);


        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return listView;

    }


}
