package io.github.jokurio.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


import java.util.ArrayList;


public class ClubsFragment extends Fragment {


    public ClubsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word(R.string.first_club, R.string.loc_first_club, R.drawable.club_one));
        words.add(new Word(R.string.second_club, R.string.loc_second_club, R.drawable.club_two));
        words.add(new Word(R.string.third_club, R.string.loc_third_club, R.drawable.club_three));
        words.add(new Word(R.string.fourth_club, R.string.loc_fourth_club, R.drawable.club_four));
        words.add(new Word(R.string.fifth_club, R.string.loc_fifth_club, R.drawable.club_five));
        words.add(new Word(R.string.sixth_club, R.string.loc_sixth_club, R.drawable.club_six));
        words.add(new Word(R.string.seventh_club, R.string.loc_seventh_club, R.drawable.club_seven));

        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.clubs);


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
