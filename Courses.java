
package courses;
import java.util.Scanner;

public class Courses {

   
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Programs: 1.COA 2.CEA 3.CITCS 4.CTE 5.CAS 6.CBA \n");
    System.out.print("Enter Program:");
    String dept = sc.nextLine();
    String prog;
    if(dept.equalsIgnoreCase("Coa")||dept.equals("1")){
       
        System.out.println("Enter College Program \n"
            +"[1]Bachelor of Science in Accountancy \n"
            + "[2]Bachelor of Science in Accounting Technology \n"
            + "[3]Bachelor of Science in Management Accounting \n"
            + "[4]Bachelor of Science in Forensic Accounting");
        prog = sc.next();
        System.out.println("-------------------------");
        
        if(prog.equals("1")){
            System.out.println("The Bachelor of Science in Accountancy (BSA) curriculum adopts CHED MEMORANDUM ORDER NO. 3 Series of 2007, which is based on International Education Standards aimed to equip students to meet the competencies required in the workplace whether in the country or abroad. It is an 11 trimester course (3 years plus 2 semesters) which is equivalent to a 5-year course in a semestral setting. The program prepares students to be liberally educated accountants who can think and write clearly, effectively, and critically. It also prepares them to become total business advisors, who are knowledgeable with business structures and economic concepts; and trains them to be ethically and technically competent in the field of accounting and auditing.\n" +
"\n" +
"A BSA graduate can pursue a career in any of the four (4) major fields of accountancy. The graduate can be a Certified Public Accountant (CPA) Public Practitioner, who chooses to be an auditor, tax or management consultant. Second, the graduate may join commerce and industry as a comptroller, internal auditor, financial accounting and reporting staff within the Accounting Department of a business enterprise. Third, the graduate may choose to join the government as an accountant, auditor, or financial analyst in different government agencies like the COA, BIR, GSIS, AFP, and the like. Lastly, the graduate may join the education sector as a member of the College of Accountancy.\n" +
"\n" +
"A graduate of BS Accountancy is eligible to take the Certified Public Accountants Licensure Examination.");
        }
        if (prog.equals("2")){
            System.out.println("The BSAcT is a program that prepares students for a career in the accounting and finance divisions of organizations in the private and public sectors. The accounting courses in the BSAcT program, combined with business management courses, equip students with the needed skills, proficiency, and intellectual abilities to lead successful careers. All four major sectors of accountancy, namely public practice, commerce and industry, government, and education, need support staff who will work as bookkeepers, financial analysts, audit staff, inventory control accountants, general ledger accountants, receivables accountants, payables accountants, and other functions where the CPA credential is not required. The BSAcT graduate could adequately respond to this need.\n" +
"\n" +
"The BSAcT program of the University of the Cordilleras has a curriculum spread over nine terms or three calendar years. This feature enables the student to obtain the BSAcT degree one year earlier than in most schools, and allows the student to save precious time and financial resources.\n" +
"\n" +
"The program's strong finance element also opens up career opportunities in non-accounting related aspects of commerce, banking and other financial institutions. In addition, the BSAcT graduate can be employed in the highly lucrative Business Process Outsourcing industry, rendering financial and accounting services.\n" +
"\n" +
"BSAcT is a non-Board program. The BSAcT student if qualified, may pursue the 4-year Bachelor of Science in Accountancy program and be eligible to take the licensure examination for Certified Public Accountant.");
        }
        if (prog.equals("3")){
            System.out.println("The BSMA curriculum is a 9 trimester course (3 years), equivalent to a 4-year course in a semestral setting. The course prepares students for a career within the accounting and finance division of both private enterprises and public sectors. The courses offered are a combination of accounting and related business subjects to equip them with the needed skills, proficiency and intellectual abilities. All the four (4) major fields of Accountancy, namely, public practice, commerce and industry, government, and education, need support staff to work as bookkeepers, financial analysts, audit staff, inventory control personnel, accounts payable administration personnel and other accounting works where a CPA title is not required. The BSMA graduate could adequately respond to this need.\n" +
"\n" +
"The course's strong finance element also opens up career opportunities in non-accounting related aspects of commerce, banking and other financial institutions. Among others, the BSMA graduate can be employed in the highly lucrative Business Process Outsourcing (BPO) industry rendering financial and accounting services.\n" +
"\n" +
"BSMA is a non-board program. The student may pursue the Bachelor of Science in Accountancy Program and be eligible to take the Certified Public Accountant Licensure Examination.");
        }
        if (prog.equals("4")){
            System.out.println("BS in Forensic Accounting is a degree program that prepares a person to become a professional forensic accountant or fraud examiner. The program has a total of 201 units and can be finished within nine terms or three years. Forensic Accounting or financial forensics is the specialty practice area of accountancy that encompasses engagements that deters and/or detects fraud and may result from actual or anticipated disputes or litigation. The integration of accounting, auditing and investigative skills yields the specialization known as Forensic Accounting. It provides an accounting analysis that is suitable to the court which will form the basis for discussion, debate and ultimately dispute resolution.\n" +
"\n" +
"Forensic Accounting encompasses both Litigation Support and Investigative Accounting. Litigation Support provides assistance of an accounting nature in a matter involving existing or pending litigation. It deals primarily with issues related to the quantification of economic damages. A typical litigation support assignment would be calculating the economic loss resulting from a breach of contract.\n" +
"\n" +
"Investigative Accounting is often associated with investigations of white collar crimes. A typical investigative accounting assignment would be an investigation of employee theft. Other examples include securities fraud, insurance fraud, kickbacks, embezzlement, money laundering, pyramiding schemes, large scale syndicated estafa, economic sabotage, and plunder.\n" +
"\n" +
"The BSFrA curriculum prepares the BSFrA graduate to pass the examinations for global certifications such as the Certified Forensic Accountant and the Certified Fraud Examiner.");
            
        }
      
                    
        
    }
    
    if (dept.equalsIgnoreCase("cea")||dept.equals("2")){
        System.out.println("Enter College Program\n"
             +("[1]Bachelor of Science in Architecture\n")
             +("[2]Bachelor of Science in cIVIL Engineering\n")
             +("[3]Bachelor of Science in Compite Engineering\n")
             +("[4]Bachelor of Science in Elecetronic Engineering")
        );
        prog = sc.next();
         System.out.println("-------------------------");
         if (prog.equals("1")){
             System.out.println("Architecture prepares the students for a forerunning practice of the different aspects of the profession. Students are provided with hands-on approach of training in planning, design and implementation of the aesthetic and functional requirements of living and monumental spaces for an individual, a community or an industry. Founded on the theory and practice of designing, with an introduction to computer-aided designing and drafting, a graduate will be prepared for such various field of architecture such as interior design, physical planning, landscaping, urban planning and building construction.");
         }
         if (prog.equals("2")){
             System.out.println("The civil engineering program is designed to produce professionals who can harness the forces of nature and the earth's natural resources to provide facilities of living, industry and transportation. With mathematical and physical science as foundation, the students will be trained both theoretical and practical aspects of surveying, hydraulics, geotechnical engineering, construction management, structural engineering and transportation engineering.");
         }
         if (prog.equals("3")){
             System.out.println("In the fast changing world of computers, the Computer Engineering program provides students with the fundamentals of the theory and design of computer software, system, and hardware. Students shall be trained with hands-on applications of the latest trends in software engineering, microchip technology, automation, and mechatronics, thus, graduating with adequate knowledge and skills for a demanding industry in computer technology.");
         }
         if (prog.equals("4")){
             System.out.println("The program of Electronics Engineering aims to produce competitive professionals in the world of electronics, communications and its various areas of applications. The science program is deeply rooted in mathematics with full training in theories and design of electronic circuits, communication and microprocessor system. Graduates will be expected to apply theories in practical applications using the latest tools including computer interfaces for its graduates to be ready and up-to-date in the modern demand of the industry.");
         }
    }
    if (dept.equalsIgnoreCase("citcs")||dept.equals("3")){
        System.out.println("Enter College Program \n"
            + "[1]Bachelor of Science in Computer Science \n"
            + "[2]Bachelor of Science in Information Technology \n"
            + "[3]Bachelor of Science in Information System \n"
            + "[4]Associate in Computer Technology");
        prog = sc.next();
        System.out.println("-------------------------");
        if (prog.equals("1")){
            System.out.println("The Bachelor of Science in Computer Science program provides the students with an in-depth understanding on the theoretical and applied aspects of computing. Students gain knowledge of the theories along with the methodologies and techniques in the research and development of multifaceted software systems as well as new knowledge in the field of computing.\n" +
"\n" +
"To give emphasis on the current areas of computing three concentrations for the BSCS program were identified namely: the Digital Arts and Animation Track, the Mobile Technology Track and the Embedded Application Track.");
        if (prog.equals("2")){
            System.out.println("The Bachelor of Science in Information Technology (BSIT) is comprised of two tracks: Network Security and Web Technology. The program focuses on the roles of IT professionals ranging from installing applications to designing computer networks and databases to meet the needs of the industry and government. The development, management, and maintenance of IT systems are key competitive factors that are essential to business success in today's world.\n" +
"\n" +
"The Australian Qualification is embedded in the BSIT curriculum effective SY 2009-2010 and 2011-2012");
        if (prog.equals("3")) {
            System.out.println("The curriculum Bachelor of Science in Information Systems (BSIS) program is designed to respond to the needs of the students for critical skills and knowledge required to direct and to control computerized information resources within diverse organizational settings. The study of Information Systems provides professionals with the expertise and knowledge to support innovation, planning, and management of information infrastructures as well as the coordination of information resources.");
        if (prog.equals("4")){
            System.out.println("The Associate in Computer Technology program provides the students with the skills and understanding to manage, improve and take care of computer systems and computer applications. Students will be prepared to work with advanced computer and communications equipments, computer applications and as support for offices and IT organizations.");
        }    
        }   
        }         
        }
    }
    if (dept.equalsIgnoreCase("CTE")||dept.equals("4")){
        System.out.println("Enter College Program \n"
            + "[1]Bachelor of Science in Elementary Education - General \n"
            + "[2]Bachelor of Science in Elementary Educaion \n"
            + "[3]Bachelor of Science in Secondary Education" );
        prog = sc.next();
        System.out.println("-------------------------");
        if (prog.equals("1")){
            System.out.println("The BEEd program aims to produce competent and effective teachers in the elementary school. The program integrates theory and practice in order to provide students not only with the necessary pedagogical skills but also with adequate and updated knowledge in the various disciplines. Students under this program are trained to develop the right attitude towards teaching as well as the basic skills necessary to conduct research.");
        }
        if (prog.equals("2")){
            System.out.println("he BEEd program aims to produce competent and effective teachers in the elementary school. The program integrates theory and practice in order to provide students not only with the necessary pedagogical skills but also with adequate and updated knowledge in the various disciplines. Students under this program are trained to develop the right attitude towards teaching as well as the basic skills necessary to conduct research. The BEEd curriculum offers specialization in Special Education (SPED) and in Preschool Education.");
        }
        if (prog.equals("3")){
            System.out.println("The BSEd program aims to produce competent and effective teachers in the secondary level. The program also integrates theory and practice in order to provide the students not only with the necessary pedagogical skills but also with adequate and updated knowledge in their field of specialization. Students under this program are trained to develop the right attitude towards teaching. The program also provides students with the knowledge and basic skills necessary to conduct research work.");
        }
    }
    if (dept.equalsIgnoreCase("CAS")||dept.equals("5")){
        System.out.println("Enter College Program \n"
            + "[1]Bachelor of Arts in English\n"
            + "[2]Bachelor of Arts in Political Science\n"
            + "[3]Bachelor of Arts in Communication\n"
            + "[4]Bachelor of Arts in Psychology ");
        prog = sc.next();
        System.out.println("-------------------------");
        
        if (prog.equals("1")){
            System.out.println("The Bachelor of Arts in English offers a complete three-year curriculum in the trimester school calendar system. The subjects offered in the course hone the four macro-communication skills, thus, developing the abilities of students to speak and write with clarity, and to listen and read with comprehension. At the same time, these subjects develop the skills in critical and creative thinking, literary analyses, intrapersonal and public communications.");
        }
        if (prog.equals("2")){
            System.out.println("Bachelor of Arts in Political Science, a three-year degree program in the trimester school calendar system, is a preparatory course to Bachelor of Laws. It is designed to equip students with basic knowledge to become researchers and/or employees in government and non-government offices as well as in public and private political agencies.");
        }
        if (prog.equals("3")){
            System.out.println("Mass Communication, a three-year degree program in the trimester calendar system, is designed for students who are interested to be trained in print media and electronic media - inspire young men and women to seek socially useful and rewarding careers in a field whose importance is second to none.");
        }
        if (prog.equals("4")){
            System.out.println("The Bachelor of Science in Psychology is a three-year degree program in the trimester school calendar system. The program examines the science behind individual and collective behavior. It features both active and collaborative experiences in addition to intensive internship experiences, and is most appropriate for students who wish to develop a set of applied scientific and human relations skills that will prepare them for entry-level employment in a wide range of government and private human service organizations and agencies, and in business and industry.");
        }
    }
    if (dept.equalsIgnoreCase("CBA")||dept.equals("6")){
        System.out.println("Enter College Program \n"
            + "[1]Bachelor of Science in Bussiness Administration \n"
            + "[2]Bachelor of Science of Entreprenuership\n"
            + "[3]Bachelor of Science in Office Administration"
           );
        prog = sc.next();
        System.out.println("-------------------------");
        
        if (prog.equals("1")){
            System.out.println("Graduates possess:\n" +
"necessary professional knowledge and relevant employability skills, such as communication, teamwork, problem-solving, initiative and enterprise, planning and organizing, self-management, learning and technology, for self or corporate employment, making them locally and globally competitive.\n" +
"thorough understanding and appreciation of corporate governance and social responsibility.\n" +
"relevant values and professional ethics for responsible practice and responsive service in any business endeavor.\n" +
"sufficient exposure to real work environment and meaningful related learning experience.");
        }
        if (prog.equals("2")){
            System.out.println("Graduates possess:\n" +
"necessary professional knowledge and relevant employability skills, such as communication, teamwork, problem-solving, initiative and enterprise, planning and organizing, self-management, learning and technology, for self or corporate employment, making them locally and globally competitive.\n" +
"proper orientation and motivation of an entrepreneur.\n" +
"relevant values and professional ethics for responsible practice and responsive service in any entrepreneurial endeavor.\n" +
"sufficient exposure to real work environment and meaningful related learning experience.");
        }
        if (prog.equals("3")){
            System.out.println("Graduates possess:\n" +
"necessary professional knowledge and relevant employability skills, such as communication, teamwork, problem-solving, initiative and enterprise, planning and organizing, self-management, learning and technology, for self or corporate employment, making them locally and globally competitive.\n" +
"the requirements for an office administration career specifically in various and general and specialized administrative support, supervisory and managerial positions.\n" +
"relevant values and professional ethics for responsible practice and responsive service in office administration endeavor.\n" +
"sufficient exposure to real work environment and meaningful related learning experience.");
        }
    
  }
    }
    }
    

