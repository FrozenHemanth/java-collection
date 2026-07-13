package Runner;

import dto.DiseaseDTO;

import java.util.*;
import java.util.stream.*;

public class DeseaseDTORunner {
    public static void main(String[] args) {
        List<DiseaseDTO> diseaseDTO = new ArrayList<>();
diseaseDTO.add(new DiseaseDTO(1, "Cough", "A respiratory disease", "Cough", "Virus", "Cough medicine", "Cure", "Nesscssery"));
diseaseDTO.add(new DiseaseDTO(2, "Fever", "A common illness", "High temperature", "Virus", "Tylenol", "Cure", "Hydration"));
diseaseDTO.add(new DiseaseDTO(3, "Headache", "An ache in the head", "Head pain", "Migraine", "Pain reliever", "Cure", "Rest"));
diseaseDTO.add(new DiseaseDTO(4, "Malaria", "A blood-borne disease", "Fever, chills, headache", "Plasmodium", "Quinine, antibiotics", "Cure", "Malaria prophylaxis"));
diseaseDTO.add(new DiseaseDTO(5, "Diabetes", "A metabolic disease", "High blood sugar", "Genetics, obesity, lack of exercise", "Insulin, diet, exercise", "Cure", "Lifestyle changes"));
diseaseDTO.add(new DiseaseDTO(6, "Cancer", "A malignant disease", "Tumors, swelling", "Genetics, lifestyle factors", "Surgery, chemotherapy, radiation", "Cure", "Lifestyle changes, genetic testing"));
diseaseDTO.add(new DiseaseDTO(7, "Hepatitis", "A liver disease", "Jaundice, fatigue", "Viruses, bacteria", "Medication, diet, rest", "Cure", "Vaccination, good hygiene"));

        diseaseDTO.add(new DiseaseDTO(8, "Influenza", "Viral respiratory infection", "Fever, cough, body aches", "Influenza viruses", "Rest, fluids, antivirals", "Management", "Flu vaccine, handwashing"));
        diseaseDTO.add(new DiseaseDTO(9, "Tuberculosis", "Bacterial lung infection", "Chronic cough, chest pain", "Mycobacterium tuberculosis", "Antibiotics (long-term)", "Cure", "BCG vaccine, ventilation"));
        diseaseDTO.add(new DiseaseDTO(10, "Malaria", "Mosquito-borne blood disease", "Chills, fever, sweating", "Plasmodium parasites", "Antimalarial medication", "Cure", "Mosquito nets, bug spray"));
        diseaseDTO.add(new DiseaseDTO(11, "Streptococcal Pharyngitis", "Bacterial throat infection", "Sore throat, fever, swollen tonsils", "Streptococcus pyogenes", "Antibiotics", "Cure", "Good hygiene, avoiding contact"));
        diseaseDTO.add(new DiseaseDTO(12, "Chickenpox", "Highly contagious viral rash", "Itchy blisters, fever, fatigue", "Varicella-zoster virus", "Calamine lotion, rest, fluids", "Management", "Varicella vaccine"));
        diseaseDTO.add(new DiseaseDTO(13, "Lyme Disease", "Tick-borne bacterial infection", "Bullseye rash, fever, joint pain", "Borrelia burgdorferi", "Antibiotics", "Cure", "Tick repellent, checking skin"));
        diseaseDTO.add(new DiseaseDTO(14, "Gastroenteritis", "Inflammation of stomach/intestines", "Vomiting, diarrhea, cramps", "Rotavirus, Norovirus, Salmonella", "Rehydration fluids, rest", "Cure", "Handwashing, food safety"));
        diseaseDTO.add(new DiseaseDTO(15, "Dengue Fever", "Tropical mosquito-borne viral illness", "High fever, severe joint pain", "Dengue virus", "Pain relief, hydration", "Management", "Mosquito control, vaccine"));


        diseaseDTO.add(new DiseaseDTO(16, "Type 2 Diabetes", "Chronic metabolic disorder", "Increased thirst, frequent urination", "Insulin resistance, obesity", "Metformin, insulin, diet", "Management", "Healthy diet, regular exercise"));
        diseaseDTO.add(new DiseaseDTO(17, "Hypertension", "Chronic high blood pressure", "Often asymptomatic, headaches", "Genetics, high salt diet, stress", "Antihypertensives, low-sodium diet", "Management", "Weight management, limiting salt"));
        diseaseDTO.add(new DiseaseDTO(18, "Asthma", "Chronic airway inflammation", "Wheezing, shortness of breath", "Allergens, genetics, pollution", "Inhalers, steroids", "Management", "Avoiding triggers, smoke control"));
        diseaseDTO.add(new DiseaseDTO(19, "Atherosclerosis", "Hardening of the arteries", "Chest pain, shortness of breath", "High cholesterol, smoking, obesity", "Statins, lifestyle changes, surgery", "Management", "Low-fat diet, stopping smoking"));
        diseaseDTO.add(new DiseaseDTO(20, "Gout", "Form of inflammatory arthritis", "Severe joint pain, redness", "High uric acid, diet rich in purines", "NSAIDs, uric acid-lowering drugs", "Management", "Limiting alcohol and red meat"));
        diseaseDTO.add(new DiseaseDTO(21, "Chronic Kidney Disease", "Gradual loss of kidney function", "Fatigue, swollen ankles, nausea", "Diabetes, hypertension", "Blood pressure meds, dialysis", "Management", "Controlling blood sugar and BP"));
        diseaseDTO.add(new DiseaseDTO(22, "Osteoarthritis", "Degenerative joint disease", "Joint pain, stiffness, flexibility loss", "Aging, wear and tear, joint injury", "Pain relievers, physical therapy", "Management", "Maintaining healthy weight"));
        diseaseDTO.add(new DiseaseDTO(23, "Gastroesophageal Reflux Disease", "Chronic acid reflux", "Heartburn, chest pain, regurgitation", "Weak lower esophageal sphincter, obesity", "Antacids, PPIs, dietary changes", "Management", "Avoiding trigger foods, smaller meals"));
        diseaseDTO.add(new DiseaseDTO(24, "Rheumatoid Arthritis", "Autoimmune joint inflammation", "Joint pain, swelling, morning stiffness", "Autoimmune response, genetics", "DMARDs, biologics, steroids", "Management", "Early diagnosis and treatment"));
        diseaseDTO.add(new DiseaseDTO(25, "Celiac Disease", "Autoimmune reaction to gluten", "Bloating, diarrhea, weight loss", "Genetic predisposition, gluten ingestion", "Strict gluten-free diet", "Management", "Avoiding wheat, barley, and rye"));
        diseaseDTO.add(new DiseaseDTO(26, "Systemic Lupus Erythematosus", "Systemic autoimmune disease", "Butterfly rash, joint pain, fatigue", "Genetic and environmental factors", "Immunosuppressants, steroids", "Management", "Sun protection, stress reduction"));
        diseaseDTO.add(new DiseaseDTO(27, "Crohn's Disease", "Chronic inflammatory bowel disease", "Abdominal pain, severe diarrhea, fatigue", "Immune system malfunction, genetics", "Anti-inflammatory drugs, surgery", "Management", "Dietary management, stress control"));
        diseaseDTO.add(new DiseaseDTO(28, "Psoriasis", "Autoimmune skin cell buildup", "Red patches with silvery scales", "Overactive immune system", "Topical creams, phototherapy", "Management", "Moisturizing, avoiding skin triggers"));
        diseaseDTO.add(new DiseaseDTO(29, "Hashimoto's Thyroiditis", "Autoimmune thyroid destruction", "Weight gain, fatigue, cold intolerance", "Genetic and immune factors", "Levothyroxine (thyroid hormone)", "Management", "Regular thyroid screening"));
        diseaseDTO.add(new DiseaseDTO(30, "Alzheimer's Disease", "Progressive neurodegenerative disease", "Memory loss, confusion, cognitive decline", "Amyloid plaques, tau tangles", "Cholinesterase inhibitors", "Management", "Mental stimulation, cardiovascular health"));
        diseaseDTO.add(new DiseaseDTO(31, "Migraine", "Neurological headache disorder", "Severe throbbing pain, nausea, photophobia", "Genetic factors, brain chemical changes", "Triptans, pain relievers, beta-blockers", "Management", "Identifying and avoiding triggers"));
        diseaseDTO.add(new DiseaseDTO(32, "Parkinson's Disease", "Nervous system movement disorder", "Tremors, stiffness, slow movement", "Loss of dopamine-producing neurons", "Levodopa, dopamine agonists", "Management", "Regular exercise, safety measures"));
        diseaseDTO.add(new DiseaseDTO(33, "Epilepsy", "Neurological disorder causing seizures", "Recurrent unprovoked seizures", "Brain injury, genetics, stroke", "Anti-epileptic drugs, surgery", "Management", "Avoiding sleep deprivation and triggers"));
        diseaseDTO.add(new DiseaseDTO(34, "Major Depressive Disorder", "Persistent mood disorder", "Prolonged sadness, loss of interest", "Neurotransmitter imbalance, trauma", "Antidepressants, psychotherapy", "Management", "Stress management, social support"));
        diseaseDTO.add(new DiseaseDTO(35, "Generalized Anxiety Disorder", "Chronic, excessive worry", "Restlessness, muscle tension, rapid heart rate", "Genetics, brain chemistry, life stress", "CBT therapy, SSRIs", "Management", "Mindfulness, reducing caffeine"));
        diseaseDTO.add(new DiseaseDTO(36, "Multiple Sclerosis", "Demyelinating central nervous system disease", "Numbness, vision problems, mobility issues", "Autoimmune attack on myelin sheath", "Disease-modifying therapies, steroids", "Management", "Regular checkups, physical health"));
        diseaseDTO.add(new DiseaseDTO(37, "Schizophrenia", "Severe chronic mental disorder", "Hallucinations, delusions, disorganized thinking", "Genetic risk, altered brain chemistry", "Antipsychotic medications, therapy", "Management", "Early intervention, continuous therapy"));
            System.out.println("--------Cause--------");
    diseaseDTO.stream()
            .filter(dis->dis
                    .getSymptoms().contains("stiffness"))
            .map(dis->dis.getCause())
            .forEach(a->System.out.println(a));
            System.out.println("-----Id-----------");
    diseaseDTO.stream().filter(dis->dis.getSymptoms().contains("stiffness")).map(dis->dis.getId()).forEach(a->System.out.println(a));
            System.out.println("-----Name less than 5 charectors-----");
    diseaseDTO.stream().filter(diseaselenght->diseaselenght.getName().length()<5).forEach(l->System.out.println("disease name "+l.getName() + " and symptom is " + "["+l.getSymptoms()+"]"));

            System.out.println("========== BASIC OPERATIONS ==========");

        // Filter by condition: Filter diseases starting with specific letter (e.g., 'C')
        System.out.println("\n--- Filter diseases starting with 'C' ---");
        diseaseDTO.stream()
            .filter(d -> d.getName().startsWith("C"))
            .forEach(d -> System.out.println(d.getName()));

        // Map to uppercase: Convert all names to uppercase
        System.out.println("\n--- Map to uppercase ---");
        diseaseDTO.stream()
            .map(d -> d.getName().toUpperCase())
            .forEach(name -> System.out.println(name));

        // Map to lowercase: Convert all names to lowercase
        System.out.println("\n--- Map to lowercase ---");
        diseaseDTO.stream()
            .map(d -> d.getName().toLowerCase())
            .forEach(name -> System.out.println(name));

        // Map to length: Get length of each string
        System.out.println("\n--- Map to length ---");
        diseaseDTO.stream()
            .map(d -> d.getName() + ": " + d.getName().length())
            .forEach(System.out::println);

        // Filter and map: Filter numbers > 10, then double them
        System.out.println("\n--- Filter IDs > 10, then double them ---");
        diseaseDTO.stream()
            .filter(d -> d.getId() > 10)
            .map(d -> d.getId() * 2)
            .forEach(id -> System.out.println(id));

        // Multiple filters: Filter by multiple conditions (id > 20 AND name length > 10)
        System.out.println("\n--- Multiple filters: id > 20 AND name length > 10 ---");
        diseaseDTO.stream()
            .filter(d -> d.getId() > 20 && d.getName().length() > 10)
            .forEach(d -> System.out.println("ID: " + d.getId() + ", Name: " + d.getName()));

        // Map to object: Convert strings to objects (already have objects, so map name to new DiseaseDTO)
        System.out.println("\n--- Map to object: Create simplified objects from names ---");
        diseaseDTO.stream()
            .map(d -> new DiseaseDTO(d.getId(), d.getName(), d.getDescription(), "", "", "", "", ""))
            .forEach(d -> System.out.println("Simplified: " + d.getName()));

        // Filter nulls: Remove null values from a list
        System.out.println("\n--- Filter nulls ---");
        List<DiseaseDTO> listWithNulls = new ArrayList<>(diseaseDTO);
        listWithNulls.add(null);
        listWithNulls.add(null);
        listWithNulls.stream()
            .filter(d -> d != null)
            .forEach(d -> System.out.println(d.getName()));

        // Map to boolean: Check if each element satisfies a condition
        System.out.println("\n--- Map to boolean: Check if name length > 8 ---");
        diseaseDTO.stream()
            .map(d -> d.getName() + ": " + (d.getName().length() > 8))
            .forEach(System.out::println);

        // ========== SORTING OPERATIONS ==========

        // Natural sorting: Sort strings alphabetically
        System.out.println("\n--- Natural sorting: Sort names alphabetically ---");
        diseaseDTO.stream()
            .map(DiseaseDTO::getName)
            .sorted()
            .forEach(System.out::println);

        // Reverse sorting: Sort in descending order
        System.out.println("\n--- Reverse sorting: Sort names in descending order ---");
        diseaseDTO.stream()
            .map(DiseaseDTO::getName)
            .sorted((a, b) -> b.compareTo(a))
            .forEach(System.out::println);

        // Custom sorting: Sort by object field (sort by name)
        System.out.println("\n--- Custom sorting: Sort by name ---");
        diseaseDTO.stream()
            .sorted((d1, d2) -> d1.getName().compareTo(d2.getName()))
            .forEach(d -> System.out.println(d.getName()));

        // Multi-field sorting: Sort by multiple fields (id then name)
        System.out.println("\n--- Multi-field sorting: Sort by id then name ---");
        diseaseDTO.stream()
            .sorted((d1, d2) -> {
                int idCompare = Integer.compare(d1.getId(), d2.getId());
                return idCompare != 0 ? idCompare : d1.getName().compareTo(d2.getName());
            })
            .forEach(d -> System.out.println("ID: " + d.getId() + ", Name: " + d.getName()));

        // Sort after filter: Filter then sort results
        System.out.println("\n--- Sort after filter: Filter id > 15, then sort by name ---");
        diseaseDTO.stream()
            .filter(d -> d.getId() > 15)
            .sorted((d1, d2) -> d1.getName().compareTo(d2.getName()))
            .forEach(d -> System.out.println("ID: " + d.getId() + ", Name: " + d.getName()));

        // Sort numbers: Sort integers in ascending/descending
        System.out.println("\n--- Sort IDs in ascending order ---");
        diseaseDTO.stream()
            .map(DiseaseDTO::getId)
            .sorted()
            .forEach(System.out::println);

        System.out.println("\n--- Sort IDs in descending order ---");
        diseaseDTO.stream()
            .map(DiseaseDTO::getId)
            .sorted((a, b) -> b.compareTo(a))
            .forEach(System.out::println);

        // Sort by length: Sort strings by their length
        System.out.println("\n--- Sort names by length ---");
        diseaseDTO.stream()
            .map(DiseaseDTO::getName)
            .sorted((a, b) -> Integer.compare(a.length(), b.length()))
            .forEach(name -> System.out.println(name + " (length: " + name.length() + ")"));

        // Case-insensitive sort: Sort strings ignoring case
        System.out.println("\n--- Case-insensitive sort ---");
        diseaseDTO.stream()
            .map(DiseaseDTO::getName)
            .sorted(String::compareToIgnoreCase)
            .forEach(System.out::println);

        // Sort nulls first/last: Handle nulls in sorting
        System.out.println("\n--- Sort with nulls first ---");
        List<String> namesWithNulls = new ArrayList<>();
        namesWithNulls.add(null);
        namesWithNulls.add("Diabetes");
        namesWithNulls.add(null);
        namesWithNulls.add("Cancer");
        namesWithNulls.add("Asthma");
        namesWithNulls.stream()
            .sorted((a, b) -> a == null ? -1 : (b == null ? 1 : a.compareTo(b)))
            .forEach(name -> System.out.println(name == null ? "null" : name));

        System.out.println("\n--- Sort with nulls last ---");
        namesWithNulls.stream()
            .sorted((a, b) -> a == null ? 1 : (b == null ? -1 : a.compareTo(b)))
            .forEach(name -> System.out.println(name == null ? "null" : name));

        // Sort by computed value: Sort by calculated property (description length)
        System.out.println("\n--- Sort by computed value: Sort by description length ---");
        diseaseDTO.stream()
            .sorted((d1, d2) -> Integer.compare(d1.getDescription().length(), d2.getDescription().length()))
            .forEach(d -> System.out.println(d.getName() + " (desc length: " + d.getDescription().length() + ")"));

        System.out.println("\n========== TERMINAL OPERATIONS ==========");

        System.out.println("\n--- Count elements matching condition (name length > 10) ---");
        long count = diseaseDTO.stream().filter(d -> d.getName().length() > 10).count();
        System.out.println("Count: " + count);

        System.out.println("\n--- Count all elements ---");
        long totalCount = diseaseDTO.stream().count();
        System.out.println("Total count: " + totalCount);

        System.out.println("\n--- Collect to ArrayList ---");
        List<String> namesList = diseaseDTO.stream().map(DiseaseDTO::getName).collect(Collectors.toList());
        System.out.println("Collected to List: " + namesList);

        System.out.println("\n--- Collect to HashSet (remove duplicates) ---");
        Set<String> namesSet = diseaseDTO.stream().map(DiseaseDTO::getName).collect(Collectors.toSet());
        System.out.println("Collected to Set: " + namesSet);

        System.out.println("\n--- Collect to Map (id -> name) ---");
        Map<Integer, String> idToName = diseaseDTO.stream().collect(Collectors.toMap(DiseaseDTO::getId, DiseaseDTO::getName));
        System.out.println("Collected to Map: " + idToName);

        System.out.println("\n--- Collect joining with delimiter ---");
        String joinedNames = diseaseDTO.stream().map(DiseaseDTO::getName).collect(Collectors.joining(", "));
        System.out.println("Joined names: " + joinedNames);

        System.out.println("\n--- Collect grouping by cure ---");
        Map<String, List<DiseaseDTO>> groupedByCure = diseaseDTO.stream().collect(Collectors.groupingBy(DiseaseDTO::getCure));
        groupedByCure.forEach((cure, diseases) -> System.out.println(cure + ": " + diseases.size() + " diseases"));

        System.out.println("\n--- Collect partitioning by curable (cure equals 'Cure') ---");
        Map<Boolean, List<DiseaseDTO>> partitionedByCure = diseaseDTO.stream().collect(Collectors.partitioningBy(d -> d.getCure().equals("Cure")));
        System.out.println("Curable: " + partitionedByCure.get(true).size());
        System.out.println("Not curable: " + partitionedByCure.get(false).size());

        System.out.println("\n--- Reduce to sum (sum of all IDs) ---");
        int sum = diseaseDTO.stream().map(DiseaseDTO::getId).reduce(0, Integer::sum);
        System.out.println("Sum of IDs: " + sum);

        System.out.println("\n--- Reduce to max (max ID) ---");
        int maxId = diseaseDTO.stream().map(DiseaseDTO::getId).reduce(Integer::max).orElse(0);
        System.out.println("Max ID: " + maxId);

        System.out.println("\n--- Reduce to min (min ID) ---");
        int minId = diseaseDTO.stream().map(DiseaseDTO::getId).reduce(Integer::min).orElse(0);
        System.out.println("Min ID: " + minId);

        System.out.println("\n========== MATCHING OPERATIONS ==========");

        System.out.println("\n--- anyMatch: Check if any disease has 'virus' in cause ---");
        boolean hasVirus = diseaseDTO.stream().anyMatch(d -> d.getCause().toLowerCase().contains("virus"));
        System.out.println("Has virus in cause: " + hasVirus);

        System.out.println("\n--- allMatch: Check if all diseases have non-empty names ---");
        boolean allHaveNames = diseaseDTO.stream().allMatch(d -> d.getName() != null && !d.getName().isEmpty());
        System.out.println("All have names: " + allHaveNames);

        System.out.println("\n--- noneMatch: Check if no disease has empty description ---");
        boolean noneEmptyDesc = diseaseDTO.stream().noneMatch(d -> d.getDescription() == null || d.getDescription().isEmpty());
        System.out.println("None have empty description: " + noneEmptyDesc);

        System.out.println("\n--- Match with filter: Check if any disease with id > 30 has 'Management' as cure ---");
        boolean hasManagement = diseaseDTO.stream().filter(d -> d.getId() > 30).anyMatch(d -> d.getCure().equals("Management"));
        System.out.println("Has Management cure for id > 30: " + hasManagement);

        System.out.println("\n--- Match empty stream: anyMatch on empty stream ---");
        boolean emptyMatch = diseaseDTO.stream().filter(d -> d.getId() > 100).anyMatch(d -> d.getName().length() > 5);
        System.out.println("Empty stream anyMatch: " + emptyMatch);

        System.out.println("\n========== FIND OPERATIONS ==========");

        System.out.println("\n--- findFirst: Find first disease with id > 20 ---");
        Optional<DiseaseDTO> first = diseaseDTO.stream().filter(d -> d.getId() > 20).findFirst();
        first.ifPresent(d -> System.out.println("First found: " + d.getName()));

        System.out.println("\n--- findAny: Find any disease with 'Diabetes' in name ---");
        Optional<DiseaseDTO> any = diseaseDTO.stream().filter(d -> d.getName().contains("Diabetes")).findAny();
        any.ifPresent(d -> System.out.println("Any found: " + d.getName()));

        System.out.println("\n--- findFirst with filter: Filter then find first ---");
        Optional<DiseaseDTO> firstFiltered = diseaseDTO.stream().filter(d -> d.getName().startsWith("C")).findFirst();
        firstFiltered.ifPresent(d -> System.out.println("First starting with C: " + d.getName()));

        System.out.println("\n--- findAny vs findFirst in parallel stream ---");
        Optional<DiseaseDTO> parallelAny = diseaseDTO.parallelStream().filter(d -> d.getId() > 10).findAny();
        Optional<DiseaseDTO> parallelFirst = diseaseDTO.parallelStream().filter(d -> d.getId() > 10).findFirst();
        System.out.println("Parallel findAny: " + parallelAny.map(DiseaseDTO::getName).orElse("Not found"));
        System.out.println("Parallel findFirst: " + parallelFirst.map(DiseaseDTO::getName).orElse("Not found"));

        System.out.println("\n--- Optional handling: orElse, ifPresent ---");
        Optional<DiseaseDTO> notFound = diseaseDTO.stream().filter(d -> d.getId() > 100).findFirst();
        DiseaseDTO result = notFound.orElse(new DiseaseDTO(0, "Not Found", "", "", "", "", "", ""));
        System.out.println("OrElse result: " + result.getName());

        System.out.println("\n========== INTERMEDIATE OPERATIONS ==========");

        System.out.println("\n--- distinct: Remove duplicate IDs ---");
        List<Integer> idsWithDuplicates = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 5);
        List<Integer> distinctIds = idsWithDuplicates.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct IDs: " + distinctIds);

        System.out.println("\n--- limit: Get first 5 diseases ---");
        diseaseDTO.stream().limit(5).forEach(d -> System.out.println(d.getName()));

        System.out.println("\n--- skip: Skip first 10 diseases ---");
        diseaseDTO.stream().skip(10).limit(5).forEach(d -> System.out.println(d.getName()));

        System.out.println("\n--- limit after filter: Filter then limit ---");
        diseaseDTO.stream().filter(d -> d.getName().startsWith("C")).limit(3).forEach(d -> System.out.println(d.getName()));

        System.out.println("\n--- skip and limit: Pagination (skip 10, limit 5) ---");
        diseaseDTO.stream().skip(10).limit(5).forEach(d -> System.out.println("ID: " + d.getId() + ", Name: " + d.getName()));

        System.out.println("\n--- flatMap: Flatten nested lists ---");
        List<List<String>> nestedNames = Arrays.asList(
            Arrays.asList("Diabetes", "Cancer"),
            Arrays.asList("Asthma", "Gout"),
            Arrays.asList("Malaria", "Fever")
        );
        nestedNames.stream().flatMap(List::stream).forEach(System.out::println);

        System.out.println("\n--- flatMap on objects: Flatten symptoms split by comma ---");
        diseaseDTO.stream()
            .flatMap(d -> Arrays.stream(d.getSymptoms().split(", ")))
            .distinct()
            .limit(10)
            .forEach(System.out::println);

        System.out.println("\n--- peek: Debug stream pipeline ---");
        diseaseDTO.stream()
            .filter(d -> d.getId() > 20)
            .peek(d -> System.out.println("Filtering: " + d.getName()))
            .map(DiseaseDTO::getName)
            .limit(3)
            .forEach(name -> System.out.println("Result: " + name));

        System.out.println("\n--- dropWhile: Drop elements while id < 15 ---");
        diseaseDTO.stream()
            .sorted(Comparator.comparingInt(DiseaseDTO::getId))
            .dropWhile(d -> d.getId() < 15)
            .limit(5)
            .forEach(d -> System.out.println(d.getName()));

        System.out.println("\n--- takeWhile: Take elements while id < 10 ---");
        diseaseDTO.stream()
            .sorted(Comparator.comparingInt(DiseaseDTO::getId))
            .takeWhile(d -> d.getId() < 10)
            .forEach(d -> System.out.println(d.getName()));

        System.out.println("\n========== ADVANCED OPERATIONS ==========");

        System.out.println("\n--- Parallel stream: Process in parallel ---");
        long parallelCount = diseaseDTO.parallelStream().filter(d -> d.getName().length() > 8).count();
        System.out.println("Parallel count: " + parallelCount);

        System.out.println("\n--- Stream from array ---");
        String[] nameArray = {"Diabetes", "Cancer", "Asthma"};
        Arrays.stream(nameArray).forEach(System.out::println);

        System.out.println("\n--- Stream from collection ---");
        Set<String> nameSet = new HashSet<>(Arrays.asList("Diabetes", "Cancer", "Asthma"));
        nameSet.stream().forEach(System.out::println);

        System.out.println("\n--- Stream builder: Use Stream.builder() ---");
        Stream.Builder<String> builder = Stream.builder();
        builder.add("Diabetes").add("Cancer").add("Asthma");
        builder.build().forEach(System.out::println);

        System.out.println("\n--- Stream generate: Generate infinite stream with limit ---");
        Stream.generate(() -> "Disease").limit(3).forEach(System.out::println);

        System.out.println("\n--- Stream iterate: Create stream with iteration ---");
        Stream.iterate(1, n -> n + 1).limit(5).forEach(System.out::println);

        System.out.println("\n--- IntStream operations: Use IntStream for numeric operations ---");
        IntStream.range(1, 6).forEach(System.out::println);

        System.out.println("\n--- LongStream: Use specialized stream ---");
        LongStream.rangeClosed(1L, 5L).forEach(System.out::println);

        System.out.println("\n--- DoubleStream: Use specialized stream ---");
        DoubleStream.of(1.1, 2.2, 3.3).forEach(System.out::println);

        System.out.println("\n--- Boxed stream: Convert primitive stream to object stream ---");
        List<Integer> boxed = IntStream.range(1, 6).boxed().collect(Collectors.toList());
        System.out.println("Boxed: " + boxed);

        System.out.println("\n========== REAL-WORLD SCENARIOS ==========");

        System.out.println("\n--- Filter diseases by symptom: Find diseases with 'fever' ---");
        diseaseDTO.stream()
            .filter(d -> d.getSymptoms().toLowerCase().contains("fever"))
            .forEach(d -> System.out.println(d.getName()));

        System.out.println("\n--- Group diseases by etiology (cause) ---");
        Map<String, List<DiseaseDTO>> byCause = diseaseDTO.stream().collect(Collectors.groupingBy(DiseaseDTO::getCause));
        byCause.forEach((cause, diseases) -> System.out.println(cause + ": " + diseases.size()));

        System.out.println("\n--- Partition by curability (cure equals 'Cure') ---");
        Map<Boolean, List<DiseaseDTO>> curable = diseaseDTO.stream().collect(Collectors.partitioningBy(d -> d.getCure().equals("Cure")));
        System.out.println("Curable diseases: " + curable.get(true).size());
        System.out.println("Non-curable diseases: " + curable.get(false).size());

        System.out.println("\n--- Find diseases with longest name ---");
        Optional<DiseaseDTO> longestName = diseaseDTO.stream().max(Comparator.comparingInt(d -> d.getName().length()));
        longestName.ifPresent(d -> System.out.println("Longest name: " + d.getName() + " (length: " + d.getName().length() + ")"));



        System.out.println("\n--- Sort diseases by multiple fields (cure, then treatment) ---");
        diseaseDTO.stream()
            .sorted(Comparator.comparing(DiseaseDTO::getCure).thenComparing(DiseaseDTO::getTreatment))
            .limit(5)
            .forEach(d -> System.out.println(d.getCure() + " - " + d.getTreatment()));

        System.out.println("\n--- Map disease names to descriptions ---");
        Map<String, String> nameToDesc = diseaseDTO.stream().collect(Collectors.toMap(DiseaseDTO::getName, DiseaseDTO::getDescription));
        nameToDesc.forEach((name, desc) -> System.out.println(name + " -> " + desc));

        System.out.println("\n--- Filter and collect to LinkedList ---");
        LinkedList<String> linkedList = diseaseDTO.stream()
            .filter(d -> d.getId() > 20)
            .map(DiseaseDTO::getName)
            .collect(Collectors.toCollection(LinkedList::new));
        System.out.println("LinkedList: " + linkedList);

        System.out.println("\n--- Find first disease with specific cause (virus) ---");
        Optional<DiseaseDTO> viralCause = diseaseDTO.stream().filter(d -> d.getCause().toLowerCase().contains("virus")).findFirst();
        viralCause.ifPresent(d -> System.out.println("First viral disease: " + d.getName()));

        System.out.println("\n--- Check if all diseases have symptoms ---");
        boolean allHaveSymptoms = diseaseDTO.stream().allMatch(d -> d.getSymptoms() != null && !d.getSymptoms().isEmpty());
        System.out.println("All have symptoms: " + allHaveSymptoms);

        System.out.println("\n========== PERFORMANCE & EDGE CASES ==========");

        System.out.println("\n--- Handle nulls in stream: Filter out nulls safely ---");
        List<DiseaseDTO> withNulls = new ArrayList<>(diseaseDTO);
        withNulls.add(null);
        withNulls.add(null);
        long nonNullCount = withNulls.stream().filter(Objects::nonNull).count();
        System.out.println("Non-null count: " + nonNullCount);

        System.out.println("\n--- Empty stream handling: Operations on empty stream ---");
        List<DiseaseDTO> emptyList = new ArrayList<>();
        long emptyCount = emptyList.stream().count();
        System.out.println("Empty stream count: " + emptyCount);

        System.out.println("\n--- Short-circuit operations: anyMatch for early termination ---");
        boolean found = diseaseDTO.stream().anyMatch(d -> d.getName().equals("Cancer"));
        System.out.println("Found Cancer early: " + found);

        System.out.println("\n--- Stateful operations: sorted is stateful ---");
        diseaseDTO.stream().sorted(Comparator.comparing(DiseaseDTO::getName)).limit(3).forEach(d -> System.out.println(d.getName()));

        System.out.println("\n--- Side effects: Avoid side effects in forEach ---");
        List<String> collectedNames = new ArrayList<>();
        diseaseDTO.stream().map(DiseaseDTO::getName).forEach(collectedNames::add);
        System.out.println("Collected via side effect: " + collectedNames.size());

        System.out.println("\n--- Stream vs loop performance: Stream processing ---");
        long streamTime = System.currentTimeMillis();
        long streamResult = diseaseDTO.stream().filter(d -> d.getId() > 10).count();
        System.out.println("Stream result: " + streamResult);

        System.out.println("\n--- Memory efficiency: Use efficient terminal operations ---");
        boolean anyMatchResult = diseaseDTO.stream().anyMatch(d -> d.getName().length() > 20);
        System.out.println("Any match result: " + anyMatchResult);

        System.out.println("\n--- Lazy evaluation: Filter not executed without terminal operation ---");
        Stream<DiseaseDTO> lazyStream = diseaseDTO.stream().filter(d -> d.getName().length() > 100);
        System.out.println("Lazy stream created (not executed yet)");

        System.out.println("\n--- Ordering: Maintain order with sorted ---");
        diseaseDTO.stream().sorted(Comparator.comparing(DiseaseDTO::getName)).limit(3).forEach(d -> System.out.println(d.getName()));

        System.out.println("\n--- Exception handling: Handle exceptions in stream operations ---");
        diseaseDTO.stream().forEach(d -> {
            try {
                System.out.println(d.getName().toLowerCase());
            } catch (Exception e) {
                System.out.println("Error processing: " + d.getName());
            }
        });

    }}
