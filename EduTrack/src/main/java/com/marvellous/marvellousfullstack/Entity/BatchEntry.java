package com.marvellous.marvellousfullstack.Entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import lombok.Getter;
import lombok.Setter;

@Document(collection="BatchDetails") // ORM
@Setter
@Getter
public class BatchEntry
{
	@Id
	@JsonSerialize(using = ToStringSerializer.class)
	private ObjectId id;
	private String name;
	private int fees;
}
