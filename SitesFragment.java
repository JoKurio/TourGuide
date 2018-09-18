package io.github.jokurio.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


import java.util.ArrayList;


public class SitesFragment extends Fragment {

    public SitesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word(R.string.first_site, R.string.loc_first_site, R.drawable.site_one));
        words.add(new Word(R.string.second_site, R.string.loc_second_site, R.drawable.site_two));
        words.add(new Word(R.string.third_site, R.string.loc_third_site, R.drawable.site_three));
        words.add(new Word(R.string.fourth_site, R.string.loc_fourth_site, R.drawable.site_four));
        words.add(new Word(R.string.fifth_site, R.string.loc_fifth_site, R.drawable.site_five));
        words.add(new Word(R.string.sixth_site, R.string.loc_sixth_site, R.drawable.site_six));
        words.add(new Word(R.string.seventh_site, R.string.loc_seventh_site, R.drawable.site_seven));
        words.add(new Word(R.string.eighth_site, R.string.loc_eighth_site, R.drawable.site_eight));
        words.add(new Word(R.string.ninth_site, R.string.loc_ninth_site, R.drawable.site_nine));
        words.add(new Word(R.string.tenth_site, R.string.loc_tenth_site, R.drawable.site_ten));


        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.sites);


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
