package io.github.jokurio.tourguide;

public class Word {
    private int mLocationNameId;

    /**
     * String resource ID for the Miwok translation of the word
     */
    private int mLocationDetailsId;


    /**
     * Image resource ID for the word
     */
    private int mImageResourceId;


    /**
     * Create a new Word object.
     *
     * @param locationNameId    is the string resource ID for the word in a language that the
     *                          user is already familiar with (such as English)
     * @param locationDetailsId is the string resource Id for the word in the Miwok language
     * @param imageResourceId   is the drawable resource ID for the image associated with the word
     */
    public Word(int locationNameId, int locationDetailsId, int imageResourceId) {
        mLocationNameId = locationNameId;
        mLocationDetailsId = locationDetailsId;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the string resource ID for the default translation of the word.
     */
    public int getlocationNameId() {
        return mLocationNameId;
    }

    /**
     * Get the string resource ID for the Miwok translation of the word.
     */
    public int getlocationDetailsId() {
        return mLocationDetailsId;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }


}
