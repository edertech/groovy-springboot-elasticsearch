package br.com.edertech.sample.model

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository

interface SongRepository extends ElasticsearchRepository<Song,String> {

}