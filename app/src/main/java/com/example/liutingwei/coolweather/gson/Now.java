package com.example.liutingwei.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by liutingwei on 17/10/8.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
