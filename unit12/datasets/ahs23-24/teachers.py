import csv


def main():
    teachers = []
    with open("teacher_export.csv", "r") as fp:
        reader = csv.DictReader(fp)
        for row in reader:
            if row["Email"] != "#ERROR!":
                del row["Link"]
                teachers.append(row)
    with open("teachers.csv", "w", newline="") as fp:
        writer = csv.DictWriter(
            fp, fieldnames=["Last Name", "First Name", "Email", "Position"]
        )
        writer.writeheader()
        writer.writerows(teachers)


if __name__ == "__main__":
    main()
