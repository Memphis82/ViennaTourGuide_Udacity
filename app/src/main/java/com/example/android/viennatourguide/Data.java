package com.example.android.viennatourguide;

public class Data {

        /*
        mName used for Hotels, Sights and Restaurants
         */
        private String mName;

        /*
        mLocation is used for address information.
         */
        private String mLocation;

        /*
        mImageResourceId is used for Images
                 */
        private int mImageResourceId = NO_IMAGE_RESOURCE;

        /*
        NO_IMAGE_RESOURCE constant for image,
        If their will be no image then mImageResourceId will be set to this.
         */
        private static final int NO_IMAGE_RESOURCE = -1;

        // Google Map longitude coordinate
         private double mLongitude;;

         // Google Map latitude coordinate
         private double mLatitude;



        public Data(String name, String location, int imageResourceId, double latitude, double longitude) {
            mName = name;
            mLocation = location;
            mImageResourceId = imageResourceId;
            mLongitude = longitude;
            mLatitude = latitude;
        }

        /**
         * getName() function is used to get the Name of the place, hospital etc.
         *
         * @return mName
         */
        public String getName() {
            return mName;
        }

        /**
         * getLocation() function is used to get the location of the place,hospitals etc.
         *
         * @return mLocation
         */
        public String getLocation() {
            return mLocation;
        }

        /**
         * getImageResourceId() function is used to get the Image Resource.
         *
         * @return mImageResourceId
         */
        public int getImageResourceId() {
            return mImageResourceId;
        }

    /**
     * Get the longitude of the attraction
     */
    public double getLongitude() {

        return mLongitude;
    }

    /**
     * Get the latitude of the attraction
     */
    public double getLatitude() {

        return mLatitude;
    }
        /**
         * @return boolean value
         */
        public boolean hasImage() {
            return mImageResourceId != NO_IMAGE_RESOURCE;
        }


    }

