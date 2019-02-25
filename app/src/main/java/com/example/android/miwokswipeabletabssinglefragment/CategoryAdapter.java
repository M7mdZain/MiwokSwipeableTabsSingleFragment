package com.example.android.miwokswipeabletabssinglefragment;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * {@link CategoryAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Word} objects.
 */
class CategoryAdapter extends FragmentStatePagerAdapter {

    private static final int NUMBERS_ACTIVITY = 0;
    private static final int FAMILY_ACTIVITY = 1;
    private static final int COLORS_ACTIVITY = 2;
    private static final int PHRASES_ACTIVITY = 3;


    /**
     * Context of the app
     */
    private Context mContext;

    CategoryAdapter(FragmentManager fm, Context contex) {
        super(fm);
        mContext = contex;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {

        // Create a list of words
        ArrayList<Word> words = new ArrayList<>();

        switch (position) {

            case NUMBERS_ACTIVITY: // Numbers activity
                // Adding words to the list
                words.add(new Word("one", "lutti", R.drawable.number_one, R.raw.number_one));
                words.add(new Word("two", "otiiko", R.drawable.number_two, R.raw.number_two));
                words.add(new Word("three", "tolookosu", R.drawable.number_three, R.raw.number_three));
                words.add(new Word("four", "oyyisa", R.drawable.number_four, R.raw.number_four));
                words.add(new Word("five", "massokka", R.drawable.number_five, R.raw.number_five));
                words.add(new Word("six", "temmokka", R.drawable.number_six, R.raw.number_six));
                words.add(new Word("seven", "kenekaku", R.drawable.number_seven, R.raw.number_seven));
                words.add(new Word("eight", "kawinta", R.drawable.number_eight, R.raw.number_eight));
                words.add(new Word("nine", "wo’e", R.drawable.number_nine, R.raw.number_nine));
                words.add(new Word("ten", "na’aacha", R.drawable.number_ten, R.raw.number_ten));

                return CategoryFragment.newInstance(R.string.category_numbers, words);

            case FAMILY_ACTIVITY: // Family activity
                // Adding words to the list
                words.add(new Word("father", "әpә", R.drawable.family_father, R.raw.family_father));
                words.add(new Word("mother", "әṭa", R.drawable.family_mother, R.raw.family_mother));
                words.add(new Word("son", "angsi", R.drawable.family_son, R.raw.family_son));
                words.add(new Word("daughter", "tune", R.drawable.family_daughter, R.raw.family_daughter));
                words.add(new Word("older brother", "taachi", R.drawable.family_older_brother,
                        R.raw.family_older_brother));
                words.add(new Word("younger brother", "chalitti", R.drawable.family_younger_brother,
                        R.raw.family_younger_brother));
                words.add(new Word("older sister", "teṭe", R.drawable.family_older_sister,
                        R.raw.family_older_sister));
                words.add(new Word("younger sister", "kolliti", R.drawable.family_younger_sister,
                        R.raw.family_younger_sister));
                words.add(new Word("grandmother ", "ama", R.drawable.family_grandmother,
                        R.raw.family_grandmother));
                words.add(new Word("grandfather", "paapa", R.drawable.family_grandfather,
                        R.raw.family_grandfather));

                return CategoryFragment.newInstance(R.string.category_family, words);

            case COLORS_ACTIVITY: // Colors activity
                // Adding words to the list
                words.add(new Word("red", "weṭeṭṭi", R.drawable.color_red, R.raw.color_red));
                words.add(new Word("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow,
                        R.raw.color_mustard_yellow));
                words.add(new Word("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow,
                        R.raw.color_dusty_yellow));
                words.add(new Word("green", "chokokki", R.drawable.color_green, R.raw.color_green));
                words.add(new Word("brown", "ṭakaakki", R.drawable.color_brown, R.raw.color_brown));
                words.add(new Word("gray", "ṭopoppi", R.drawable.color_gray, R.raw.color_gray));
                words.add(new Word("black", "kululli", R.drawable.color_black, R.raw.color_black));
                words.add(new Word("white", "kelelli", R.drawable.color_white, R.raw.color_white));

                return CategoryFragment.newInstance(R.string.category_colors, words);

            case PHRASES_ACTIVITY: // Phrases activity
                // Adding words to the list
                words.add(new Word("Where are you going?", "minto wuksus",
                        R.raw.phrase_where_are_you_going));
                words.add(new Word("What is your name?", "tinnә oyaase'nә",
                        R.raw.phrase_what_is_your_name));
                words.add(new Word("My name is...", "oyaaset...", R.raw.phrase_my_name_is));
                words.add(new Word("How are you feeling?", "michәksәs?", R.raw.phrase_how_are_you_feeling));
                words.add(new Word("I’m feeling good.", "kuchi achit", R.raw.phrase_im_feeling_good));
                words.add(new Word("Are you coming?", "әәnәs'aa?", R.raw.phrase_are_you_coming));
                words.add(new Word("Yes, I’m coming.", "hәә’ әәnәm", R.raw.phrase_yes_im_coming));
                words.add(new Word("I’m coming.", "әәnәm", R.raw.phrase_im_coming));
                words.add(new Word("Let’s go.", "yoowutis", R.raw.phrase_lets_go));
                words.add(new Word("Come here.", "әnni'nem", R.raw.phrase_come_here));

                return CategoryFragment.newInstance(R.string.category_phrases, words);
            default:
                return null;
        }

    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.category_numbers);
            case 1:
                return mContext.getString(R.string.category_family);
            case 2:
                return mContext.getString(R.string.category_colors);
            case 3:
                return mContext.getString(R.string.category_phrases);
            default:
                return null;
        }
    }
}
