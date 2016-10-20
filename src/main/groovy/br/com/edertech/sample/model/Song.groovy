package br.com.edertech.sample.model

import groovy.transform.ToString

import org.springframework.data.annotation.Id
import org.springframework.data.elasticsearch.annotations.Document
import org.springframework.data.elasticsearch.annotations.Field
import org.springframework.data.elasticsearch.annotations.FieldType

@Document(indexName = 'music', type = 'songs')
@ToString(includePackage = false)
class Song {

	@Id
	String id

	String name
	int year
	String artist
}