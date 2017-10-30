package org.schabi.newpipe.extractor.services.youtube;


/*
 * Created by Christian Schabesberger on 30.10.17.
 *
 * Copyright (C) Christian Schabesberger 2015 <chris.schabesberger@mailbox.org>
 * YoutubeLiveStreamTest.java is part of NewPipe.
 *
 * NewPipe is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * NewPipe is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with NewPipe.  If not, see <http://www.gnu.org/licenses/>.
 */


import org.junit.Before;
import org.junit.Test;
import org.schabi.newpipe.Downloader;
import org.schabi.newpipe.extractor.NewPipe;
import org.schabi.newpipe.extractor.stream.StreamExtractor;

import static org.junit.Assert.assertFalse;
import static org.schabi.newpipe.extractor.ServiceList.YouTube;

/**
 * Test for {@link YoutubeStreamExtractor}
 */
public class YoutubeLiveStreamTest {
    private StreamExtractor extractor;

    @Before
    public void setUp() throws Exception {
        NewPipe.init(Downloader.getInstance());
        extractor = YouTube.getService().getStreamExtractor("https://www.youtube.com/watch?v=at5DQo7XkX0");
    }

    @Test
    public void testGetDashMpdUrl() throws Exception {
        assertFalse(extractor.getDashMpdUrl().isEmpty());
        System.out.println(extractor.getDashMpdUrl());
    }
}
