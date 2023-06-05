## Project Description (What did I build?)

Personnel at the Anacortes Family Center would like to track and report on their volunteers. Taunya, at the front desk, has just inherited this task. I designed a semi-structured Google Document where she can record volunteer visits, including the date, the volunteer's name, and the duration of the visit. She can also optionally record the nature of the service(s) provided.

Here is a [copy of the journal](https://docs.google.com/document/d/1PrzZE9jZbAXNkCg_zCKfdW8SDkwQUcwOMsqGkdXPmfI/edit?usp=sharing). In the "Extensions" > "App Script" menu, you can find the JavaScript code which parses the journal into volunteer records `{date, volunteer, hour, note}` and writes a summary to a report. The current report (which matches the actual journal, rather than this copy) is here: [Volunteer Report](https://docs.google.com/document/d/1xi4OozKILQ4xCYE5EmjdvIjj7-U78Ku9G8sdUHDLCWY/edit?usp=sharing)

## What I learned

I already knew that Apps Script existed, but each time I use it I have to re-learn the specific capabilities around Google Drive artifacts. Besides that, specifically I learned:

- The new "smart chips" (@ things) are **not** available in the script API. Nor are they available in the Python library. This prevents direct parsing of the document, since I originally instructed Taunya to record volunteers and dates as smart chips.
  - As a workaround, I extract the document as HTML, and then parse the HTML. Fortunately, folks on StackOverflow had [figured out how to do this](https://stackoverflow.com/questions/72914087/how-to-get-in-apps-script-the-value-of-a-dropdown-in-a-google-doc/72918331#72918331).
- I learned about scheduling script invocations as [time-based triggers](https://developers.google.com/apps-script/guides/triggers/installable#time-driven_triggers). This means I can generate a new report every day, automatically. Cool!

I also learned that what seems like simple instructions to me (the instructions at the top of the journal), are not yet second-nature to Taunya. I will need to continue to show her how to format her document correctly, or continually fix it myself.

## How you can try it

1. Make a copy of the journal, and a new document (empty is fine) for the report.
2. In your journal copy, visit menu "Extensions" > "Apps Script" and change the `reportId` at the top to be the id of your report document. The id is in the document url, after `/document/d/` and before `/edit#`.
3. Run the `doReport` function, granting security along the way (including the "unsafe, not verified by google" warning), and observe the execution log and resulting report.

## Why this is cool

This represents v2 of my volunteer tracking solutions for AFC. I previously set folks up with [Baserow](https://baserow.io/) where they could record volunteer activity in a database: visit records which reference volunteer records. This only sort-of worked, as databases (and spreadsheets) are less intuitive for non-technical users than is a journal. Being able to record data in a familiar, semi-structured manner is working well for folks at AFC.

On Thursday, June 8th, I'll meet with more folks who are interested in further tracking and reporting solutions. I am glad to have found something which resonates with the team!
