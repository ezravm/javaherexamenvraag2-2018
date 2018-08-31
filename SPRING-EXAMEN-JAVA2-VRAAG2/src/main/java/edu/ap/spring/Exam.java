package edu.ap.spring;

import java.awt.Point;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

@Component
public class Exam {
	
	// Maak gebruik van lambdas en streams om een array met alle
	// getallen terug te geven die deelbaar zijn door twee
	// 2 punten
	//!!!!! fout in springtest: geeft maar 1 punt voor deze test, zouden er 2 moeten zijn :)!!!!!
	public int[] getTimesTwo(int[] numbers) {
		return Arrays.stream(numbers)
				.filter(i -> i%2 == 0)
				.toArray();
	}
	
	// Maak gebruik van lambdas en streams om alle uppercase characters
	// te tellen in de gegeven string
	// 1 punt
	public int countUppercaseCharacters(String sentence) {
		return (int) sentence.chars()
						.filter(Character::isUpperCase)
						.count();
	}
	
	// Maak gebruik van lambdas en streams om het aantal keren te tellen
	// dat string s voorkomt (zowel uppercase als lowercase) in de lijst names
	// 1 punt
	//!!!!!fout in springtest, geeft 2 punten, zou 1 moeten zijn :) !!!!
	public int countChar(List<String> names, String f) {
		return names.stream()
				.collect(Collectors.groupingBy(s -> f, Collectors.counting()));

	}
	
	// Maak gebruik van lambdas en streams om het hoogste Y coordinaat
	// te vinden
	// 2 punten
	public int getMaxY(List<Point> points) {
		return points.stream()
				.mapToInt(p -> p.y)
				.max().orElseThrow(NoSuchElementException::new);
	}	
}