package com.feedblocker.utils;

import android.content.Context;

import com.feedblocker.R;

public class AppPreferences
{
    public static boolean isAppEnabled(Context context)
    {
        // Return enabled/disabled flag from SharedPreferences
        return SystemServices.getSharedPreferences(context).getBoolean(context.getString(R.string.enable_pref), context.getString(R.string.enable_default) == "true");
    }

    public static boolean isForcedBlockingEnabled(Context context)
    {
        // Return enabled/disabled flag from SharedPreferences
        return SystemServices.getSharedPreferences(context).getBoolean(context.getString(R.string.force_block_pref), context.getString(R.string.force_block_default) == "true");
    }

    public static boolean isFacebookFeedBlockingEnabled(Context context)
    {
        // Return enabled/disabled flag from SharedPreferences
        return SystemServices.getSharedPreferences(context).getBoolean(context.getString(R.string.facebook_pref), context.getString(R.string.facebook_pref_default) == "true");
    }

    public static int getFacebookTimeLimitMinutes(Context context)
    {
        // Return time limit in minutes from SharedPreferences
        return Integer.parseInt(SystemServices.getSharedPreferences(context).getString(context.getString(R.string.facebook_limit_pref), context.getString(R.string.facebook_limit_default)));
    }
}