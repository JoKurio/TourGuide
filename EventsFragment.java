package io.github.jokurio.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


import java.util.ArrayList;


public class EventsFragment extends Fragment {


    public EventsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word(R.string.first_event, R.string.info_first_event, R.drawable.event_one));
        words.add(new Word(R.string.second_event, R.string.info_second_event, R.drawable.event_two));
        words.add(new Word(R.string.third_event, R.string.info_third_event, R.drawable.event_three));
        words.add(new Word(R.string.fourth_event, R.string.info_fourth_event, R.drawable.event_four));
        words.add(new Word(R.string.fifth_event, R.string.info_fifth_event, R.drawable.event_five));
        words.add(new Word(R.string.sixth_event, R.string.info_sixth_event, R.drawable.event_ten));
        words.add(new Word(R.string.seventh_event, R.string.info_seventh_event, R.drawable.event_twelve));

        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.events);


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
