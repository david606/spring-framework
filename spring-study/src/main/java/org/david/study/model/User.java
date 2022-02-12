package org.david.study.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author david
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
	Long id;

	String name;
}
