package com.fr4gus.android.oammblo.data;

import java.util.List;

import com.fr4gus.android.oammblo.bo.Tweet;

/**
 * Abstracccion del servicio del API twitter
 * 
 * @author Franklin Garcia
 *
 * Mobiquity Inc. 2012
 */
public interface TwitterService {

    public List<Tweet> getTimeline();
}
