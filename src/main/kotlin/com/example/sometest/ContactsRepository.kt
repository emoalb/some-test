package com.example.sometest

import org.springframework.data.jpa.repository.JpaRepository

interface ContactsRepository: JpaRepository<Contacts,Int>  {
}