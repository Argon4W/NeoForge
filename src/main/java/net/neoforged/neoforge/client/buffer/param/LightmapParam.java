/*
 * Copyright (c) NeoForged and contributors
 * SPDX-License-Identifier: LGPL-2.1-only
 */

package net.neoforged.neoforge.client.buffer.param;

import net.neoforged.neoforge.client.buffer.param.general.BooleanParam;

public class LightmapParam {
    public static final class Vanilla {
        public static final BooleanParam LIGHTMAP = new BooleanParam(true);
        public static final BooleanParam NO_LIGHTMAP = new BooleanParam(false);
    }
}