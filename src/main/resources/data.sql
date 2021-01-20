
DELETE
FROM countries;

INSERT INTO countries(countryid, name, population, landmasskm2, medianage)
VALUES (39, 'Afghanistan', 37209007, 652860, 19 ),
       (138, 'Albania', 2938428, 27400, 29);

alter sequence hibernate_sequence restart with 5;
