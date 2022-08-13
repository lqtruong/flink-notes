package com.turong.flink.basic

import org.apache.flink.streaming.api.scala._

object FraudDetectionJob {

  def main(args: Array[String]) {

    val env = StreamExecutionEnvironment.getExecutionEnvironment


    env.execute("Flink Fraud Detection Job")
  }
}
