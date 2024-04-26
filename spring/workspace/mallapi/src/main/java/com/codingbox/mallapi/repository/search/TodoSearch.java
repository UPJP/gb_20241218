package com.codingbox.mallapi.repository.search;

import org.springframework.data.domain.Page;

import com.codingbox.mallapi.domain.Todo;

public interface TodoSearch {
	Page<Todo> search();

}
