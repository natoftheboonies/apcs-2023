# Unit 12 Lab 1: Exploring Data

In class, we have collected data from unstructured or semi-structured sources, and added structure.

The intent of this lab is to explore the data, and see what we can learn.

Most of these questions you can answer with a spreadsheet and filters. You might find this boring. A better choice would be to use a programming language to answer these questions. Python is an excellent choice, but it is also possible in [Java](https://stackabuse.com/reading-and-writing-csvs-in-java/), with more work.

You can also get _most_ of the credit by simply writing pseudo-code, or describing the steps you would take to answer the question.

Please add your answers to this document, and commit it back to your repo. You can use [Markdown](https://www.markdownguide.org/basic-syntax/) to format your answers. Specifically, you can use the `>` character to display a quote, and back-tick (`) character to create a code block. Supporting code, CSV files, etc. is also welcome.

> This is an answer.

```pseudo
# this is a pseudo-code answer
for each row in the data:
    if the row is a duplicate:
        remove the row
```

Please proceed with **either** AHS Courses or Track. You are welcome to work with a partner.

## AHS Courses

### Courses

We have a list of courses, and have tidied it up a bit. It is still incomplete data.

Which courses in the data set are still "duplicates", if any?

If we assume that "A" and "B" courses are offered in the fall and spring, respectively, then how many distinct courses should the school offer in a semester? We have 7 periods, so what is the minimum number of teachers required (we're in a budget crunch, after all!). Please record your assumptions as part of your answer.

The Washington State [School Report Card](https://washingtonstatereportcard.ospi.k12.wa.us/ReportCard/ViewSchoolOrDistrict/102391) lists 809 students for the 2022-23 school year.

Ignoring pesky details like course prerequisites, and student preferences, how many students would enroll in a course? What would class size be?

On the report card website, the "Classroom Teachers and Class Size" section cites 14.0 students as "Average Class Size" in 2021-22. We have 18 students in AP CS A, so we are above average! How does this average compare to your experience?

Some courses have multiple sections. If our task was to "plan the 2023-24 school year", what else would we need to know?

### Teachers

We have a list of teachers, but it is still a bit of a mess.

There are 105 entries in the data set. Let's tidy this set up a bit:

- remove the "duplicates"
- some are not "teachers". Let's add a column for "isTeacher" or equivalent.
- column "Position" often includes the word "Teacher" followed by subjects. Please extract the subjects to a different column. A regular expression would work here, as would a simple "split".

How many teachers are there in this dataset? The [report card](https://washingtonstatereportcard.ospi.k12.wa.us/ReportCard/ViewSchoolOrDistrict/102391) lists 48 teachers in 2021-22. Are all of _your_ teachers listed in this data set? (Mr. Peterson is a student teacher, so does not count.)

Teachers teach courses! Which courses can we assign to teachers, based on the data we have? Ms. Leander teaches Choir, and two courses reference Choir: MU100A/B, MU800A/B. How could we record this in the data? (There are perhaps several options.)

## Track

Our Varisty team went down to the [Sub-District meet](https://www.athletic.net/TrackAndField/meet/481263/results) yesterday. Parker and Jessica won their 1600s! I've added these results to our track data set.

We have a nice data set to explore.

How many athletes are in the data set? How many events? How many schools?

Across schools and meets, are Seniors faster than Juniors faster than Sophomores faster than Freshmen? How would we determine this?

How consistent are athletes? For athletes with multiple results, what is their average time, and range of times? Note that times are recorded as mm:ss:ms, so we'll need to convert to seconds to do math.

Which schools have the most consistent athletes?

Which athletes have improved the most over the season? Which schools?

Which schools might be the fastest in 2025 and beyond? (Hint: look at the Freshmen and Sophomores.)
