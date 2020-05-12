package com.example.sometest

import javax.persistence.*


@Entity
@Table(name = "contacts")
data class Contacts (@Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id:Int,
                     @Column(nullable = false,unique = true)
                     val name: String )