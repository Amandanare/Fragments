package com.example.admin.fragments;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class phrasesFragment extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases_fragment);

        final ArrayList<word> words = new ArrayList<word>();
        words.add(new word("Where are you Going?", "minto wuksus", R.drawable.going, R.raw.phrase_where_are_you_going));
        words.add(new word("What is your name?", "tinnә oyaase'nә", R.drawable.one, R.raw.phrase_what_is_your_name));
        words.add(new word("My name is....", "oyaaset...", R.drawable.one, R.raw.phrase_my_name_is));
        words.add(new word("How are you feeling?", "michәksәs?", R.drawable.one, R.raw.phrase_how_are_you_feeling));
        words.add(new word("I'm feeling good.", "kuchi achit", R.drawable.one, R.raw.phrase_im_feeling_good));
        words.add(new word("Are you coming?", "әәnәs'aa?", R.drawable.one, R.raw.phrase_are_you_coming));
        words.add(new word("Yes, I'm coming.", "hәә’ әәnәm", R.drawable.one, R.raw.phrase_yes_im_coming));
        words.add(new word("I'm coming.", "әәnәm", R.drawable.one, R.raw.phrase_im_coming));
        words.add(new word("Let's go.", "yoowutis", R.drawable.one, R.raw.phrase_lets_go));
        words.add(new word("Come here.", "әnni'nem", R.drawable.one, R.raw.phrase_come_here));

        wordAdapter adapter = new wordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                word word = words.get(position);
                mMediaPlayer = MediaPlayer.create(phrasesFragment.this, word.getAudioResourceId());
                mMediaPlayer.start();
            }

            //Log.v("PhraseActivity", "Word at index 0: " + words.get(0));
            // Log.v("PhraseActivity", "Word at index 1: " + words.get(1));
            //  Log.v("PhraseActivity", "Word at index 2: " + words.get(2));
            //  Log.v("PhraseActivity", "Word at index 3: " + words.get(3));
            // Log.v("PhraseActivity", "Word at index 4: " + words.get(4));
            // Log.v("PhraseActivity", "Word at index 5: " + words.get(5));
            // Log.v("PhraseActivity", "Word at index 6: " + words.get(6));
            // Log.v("PhraseActivity", "Word at index 7: " + words.get(7));
            //  Log.v("PhraseActivity", "Word at index 8: " + words.get(8));
            // Log.v("PhraseActivity", "Word at index 9: " + words.get(9));
        });
    }}


