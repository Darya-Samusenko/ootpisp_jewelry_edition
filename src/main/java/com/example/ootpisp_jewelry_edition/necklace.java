package com.example.ootpisp_jewelry_edition;

enum hold_type{
    SINGLE_RING,
    FUSION,
    DESIGNED
}
public class necklace extends chain{
    hold_type fasteners;
    boolean hasNonMeInclusions;
    int common_length;//отдельно длина металлической цепи и всего колье
}
