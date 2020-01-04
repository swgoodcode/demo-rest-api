package com.swgoodcode.demorestapi.events;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EventTest {

    @Test
    public void builder() {
        Event event = Event.builder()
                .name("sw Spring Rest API")
                .description("REST API development with Spring")
                .build();
        assertThat(event);
    }

    @Test
    public void javaBean() {
        Event event = new Event();
        String name = "Event";
        event.setName(name);
        String spring = "Spring";
        event.setDescription(spring);

        assertThat(event.getName()).isEqualTo(name);
        assertThat(event.getDescription()).isEqualTo(spring);

    }
}