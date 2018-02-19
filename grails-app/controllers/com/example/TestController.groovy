package com.example

import com.budjb.rabbitmq.publisher.RabbitMessagePublisher
import grails.rest.*
import grails.converters.*

class TestController {

  static responseFormats = ['json', 'xml']

  RabbitMessagePublisher rabbitMessagePublisher

  def index() {
    render rabbitMessagePublisher.rpc {
      routingKey = "testqueue"
      body = "Hello!"
    }
  }
}
