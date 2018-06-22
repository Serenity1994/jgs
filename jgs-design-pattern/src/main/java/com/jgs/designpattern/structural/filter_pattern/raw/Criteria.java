package com.jgs.designpattern.structural.filter_pattern.raw;

import java.util.List;

public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
