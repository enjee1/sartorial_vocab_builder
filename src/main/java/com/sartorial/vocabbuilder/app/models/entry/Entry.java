package com.sartorial.vocabbuilder.app.models.entry;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Entry {
    private Meta meta;
    private String partOfSpeech;
    private String[] definition;

    class Meta {
        // Contains a homograph indication (an integer), if applicable.
        private String id;
        private String uuid;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public String getPartOfSpeech() {
        return partOfSpeech;
    }

    // The below annotation is used to change the default key name when serializing JSON from the external API.
    @JsonProperty("fl")
    public void setPartOfSpeech(String partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }

    public String[] getDefinition() {
        return definition;
    }

    // The below annotation is used to change the default key name when serializing JSON from the external API.
    @JsonProperty("shortdef")
    public void setDefinition(String[] definition) {
        this.definition = definition;
    }
}
