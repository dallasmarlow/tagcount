package com.tumblr.sre.data;

import java.io.IOException;
import java.util.*;
        
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.conf.*;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

public class TagCountMap extends Mapper<LongWritable, Text, Text, IntWritable> {
  private IntWritable one = new IntWritable(1);
  private Text tag_word = new Text();
    
  public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
    // todo:   count token occorence per second
    // format: <epoch>\t<content>
  }
}