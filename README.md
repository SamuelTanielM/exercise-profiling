<a name="readme-top"></a>

<br />
<div align="center">
  <a href="https://github.com/SamuelTanielM/eshop">
    <img src="pictures/logo_hae.png" alt="To Source Code" width="80" height="80">
  </a>

<h3 align="center">Tutorial Modul</h3>

  <p align="center">
    Website
    <br />
    <a href="https://github.com/SamuelTanielM/eshop"><strong>Explore the code »</strong></a>
    <br />
    <br />
    <a href="https://eshop-samuelt-adpro.koyeb.app">View Site</a>
    ·
    <a href="https://scele.cs.ui.ac.id/course/view.php?id=3747">View Assignment</a>
  </p>
</div>


🏪 Tutorial Modul untuk Advance Programming Genap 2023/2024✨
<details>
  <summary>Daftar Tugas</summary>
  <ol>

<hr>
      <details>
      <summary><a href="#tugas-2">Tutorial / Module 1 | ⭐ Coding Standards</a></summary>

<hr>
<hr>
<!-- #TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>: TABLE OF CONTENTS -->
<h3 align="center">Tutorial / Module 1 | ⭐ Coding Standards</h3>   

<a name="tugas-9"></a>
<details>
<summary>Table of Contents</summary>
<ol>
  <li>
    <a href="#reflection-1-1">Reflection 1</a>
  </li>
  <li>
    <a href="#reflection-1-2">Reflection 2</a>
  </li>

</ol>
</details>



<!-- ABOUT THE PROJECT -->
<a name="reflection-1-1"></a>
## Reflection 1

You already implemented two new features using Spring Boot. Check again your source code and evaluate the coding standards that you have learned in this module. Write clean code principles and secure coding practices that have been applied to your code.  If you find any mistake in your source code, please explain how to improve your code. Please write your reflection inside the repository's README.md file.

(mohon maaf kalau Inggris saya jelek) I've learned that the module for this project provides a good basis for coding practices and clean code principles. Following the module and its style of coding, I've improved in noticing and connecting the relationship between files. Albeit, I still found it pretty inconvenient to create many files and track or change them when there's a problem occurred. Not only that, the IDE is new to me, and it's challenging to get used to since it doesn't have a good display, missing shortcuts, and lag. So I have to just get used to it first, then realize it provides much more than VS Code, it tells where the problems are in different files easily.

Since clean code principles are somewhat dependent on a programmer's preference, I don't think it matches my way of reading the lines from the code. I usually use a highlight extension in VSCode, which highlights the comments and important codes to easily help me read it, making it easy to create long lines of code without getting confused, but since this is a learning opportunity, I'll try my best to suit myself coding using the principles.


<p align="right">(<a href="#readme-top">back to top</a>)</p>

<hr>

<!-- ABOUT THE PROJECT -->
<a name="reflection-1-2"></a>
## Reflection 2

1. After writing the unit test, how do you feel? How many unit tests should be made in a class? How to make sure that our unit tests are enough to verify our program? It would be good if you learned about code coverage. Code coverage is a metric that can help you understand how much of your source is tested. If you have 100% code coverage, does that mean your code has no bugs or errors?

I think the tests are more required in more complex projects. The tests in my program don't differ from testing it manually rendering it useless and less efficient, but I can see that once the project gets more complex, the tests will be very helpful.

To make sure that the unit tests are enough to verify the program is by trying out many different situations that the program is not intended to, therefore, you can easily find bugs and errors. It doesn't mean that code has no bugs or errors if it has 100% code coverage, there are many ways to break the code from what the code can handle. Although, if it's a simple project, maybe it could have no bugs or errors, but there may be errors or bugs that haven't been found or known to cause yet.

2. Suppose that after writing the CreateProductFunctionalTest.java along with the corresponding test case, you were asked to create another functional test suite that verifies the number of items in the product list. You decided to create a new Java class similar to the prior functional test suites with the same setup procedures and instance variables. What do you think about the cleanliness of the code of the new functional test suite? Will the new code reduce the code quality? Identify the potential clean code issues, explain the reasons, and suggest possible improvements to make the code cleaner! Please write your reflection inside the repository's README.md file.

I think it will clutter the test files too much, if you need to create a new file only for several items especially if you keep track of the number of items, creating the program in the same file can be better. For example, after creating the product, add another test if the number of items is increased or not and verify it. Creating the same setup procedures and instance variables for every test in the future could potentially slow down the time it took to test the project.

The cleanliness of the code will probably look good, but navigating the projects with other codes will be hard. The new code wouldn't reduce the code quality, since it has the same setup, perhaps if the setup before is already bad, then it will be bad, but if it's good, then probably not. If we're talking about the test file quality then probably yes, but ultimately not, since it can provide for future tests that can be created or occur with relatable problems. The potential clean code issues are the new functional test is not as good as the prior, it doesn't provide readability of the code, efficiency while maintaining trackability, and many more.

The possible improvements are as such:
- make sure the code is readable for everyone, especially on the team
- it is trackable for any potential problems that may occur
- efficient with the code
- if the test can be run in the same file as another test and can cut down the time, then it's probably better to create it in the same file


<p align="right">(<a href="#readme-top">back to top</a>)</p>

<hr>


</details>

<hr>
      <details>
      <summary><a href="#tugas-2">Tutorial / Module 2 | ⭐ CI/CD</a></summary>

<hr>
<hr>
<!-- #TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>: TABLE OF CONTENTS -->
<h3 align="center">Refleksi Module 2 | ⭐ CI/CD</h3>   

<a name="tugas-9"></a>
<details>
<summary>Table of Contents</summary>
<ol>
  <li>
    <a href="#code-quality">Code quality issue(s)</a>
  </li>
  <li>
    <a href="#ci-cd">Met the definition of Continuous Integration and Continuous Deployment</a>
  </li>
  <li>
    <a href="#bonus">Met the definition of Continuous Integration and Continuous Deployment</a>
  </li>

</ol>
</details>



<!-- ABOUT THE PROJECT -->
<a name="code-quality"></a>
## Code quality issue(s)

List the code quality issue(s) that you fixed during the exercise and explain your strategy on fixing them!

- Unused import 'org.springframework.boot.test.mock.mockito.MockBean'


ada banyak dalam file yang mengimport library dan tidak digunakan, solusinya saya kunjungi setiap file dan menghilangan setiap library yang tidak digunakan sehingga ketika dimerge ke main sudah hilang masalah tersebut, dengan demikian unused import tersebut mengurangi beban import library pada setiap kode

- Document empty method body

  terdapat method yang tidak ada penjelasan saya tambahkan comment untuk menjelaskan fungsinya sehingga menghindari fungsi yang tidak memiliki penjelasan dan kedepannya dapat digunakan oleh pengguna lain dengan mudah dan dapat dimengerti

- Position literals first in String comparisons

  mengerti apa maksudnya dan tujuannya untuk menghindari nullpointerexception, dan mengganti setiap masalah tersebut
  dari
  if (columns.size() > 0 && columns.get(0).getText().equals("Product Name"))

  menjadi

  if (columns.size() > 0 && "Product Name".equals(columns.get(0).getText()))

- Unnecessary modifier 'public' on method 'delete': the method is declared in an interface type

  dengan menghilangkan segala public pada tiap method create, findall, delete, findbyid, dan update, sehingga lebih baik kodenya

- The JUnit 5 test method name 'delete_ShouldReturnDeletedProduct' doesn't match '[a-z][a-zA-Z0-9]*'

  dengan mengganti semua yang tidak camel case mengikuti camel case

- Substitute calls to size() == 0 (or size() != 0, size() > 0, size() < 1) with calls to isEmpty()

  mengganti size > 0 dengan !empty

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<hr>

<a name="ci-cd"></a>
## Met the definition of Continuous Integration and Continuous Deployment

Look at your CI/CD workflows (GitHub)/pipelines (GitLab). Do you think the current implementation has met the definition of Continuous Integration and Continuous Deployment? Explain the reasons (minimum 3 sentences)!

Workflows CI/CD yang digunakan pada kode saya yaitu PMD (Project Mess Detector) untuk menganalisis basis kode untuk potensi masalah dan mematuhi code conventions, supaya kodenya saya efektif dalam hal maintainabilitas dan kejelasan.

Selain itu, dengan mengikuti modul saya telah menerapkan Scorecard supply chain analysis tool untuk mengevaluasi dan mengoptimalkan proses proses supply chain, sehingga dari data yang terkumpul saya bisa meningkatkan efisiensi dan mengurangi cost.

Dalam bagian CD, saya juga telah mendeploy aplikasi saya di Koyeb, yang memungkinkan skalabilitas dan ketersediaan yang lancar. CI/CD ini dikonfigurasi untuk memantau cabang master, secara otomatis memicu build, testing, dan juga deployment ketika ada perubahan kode. Sehingga kode sudah aman dan dideploy dengan mulus. [Link Deployment](https://eshop-samuelt-adpro.koyeb.app)

Dengan demikian, implementasi CI/CD saya, dikombinasikan dengan alat-alat seperti PMD, Scorecard, dan deployment di Koyeb, memungkinkan saya untuk mempertahankan tingkat kualitas kode yang tinggi, mengoptimalkan proses supply chain, dan menghasilkan aplikasi yang terus menerus bagus kedepannya.


<p align="right">(<a href="#readme-top">back to top</a>)</p>

<hr>

<a name="bonus"></a>
## Bonus

Code coverage saya gunakan https://github.com/marketplace/actions/jacoco-reporter

dan dapat dicek pada [Github Action](https://github.com/SamuelTanielM/tutorial-1/actions/runs/7900930327/job/21563618793)

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<hr>


</details>

<hr>
      <details>
      <summary><a href="#tugas-2">Tutorial / Module 3 | ⭐ OO Principles & Software Maintainability</a></summary>

<hr>
<hr>
<!-- #TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>: TABLE OF CONTENTS -->
<h3 align="center">Reflection ⭐ OO Principles & Software Maintainability</h3>   

<a name="tugas-9"></a>
<details>
<summary>Table of Contents</summary>
<ol>
  <li>
    <a href="#principles">Principles applied to project</a>
  </li>
  <li>
    <a href="#benefits">Benefits of applying SOLID principles and example</a>
  </li>
  <li>
    <a href="#disadvantages">Disadvantages if you do not apply SOLID principles to your project and example</a>
  </li>

</ol>
</details>



<!-- ABOUT THE PROJECT -->
<a name="principles"></a>
## Principles applied to project

- Separation of Concerns:

  memisahkan kelas-kelas Car dan Product ke dalam file-file terpisah, membantu pemeliharaan dan kejelasan dengan memfokuskan pada fungsionalitas tertentu di setiap file.

- Interface Segregation Principle (ISP):

  implementasikan interface CarRepository dan ProductRepository, untuk bergantung hanya pada metode-metode yang digunakan, supaya fleksibilitas dan skalabilitas.

- Single Responsibility Principle (SRP):

  setiap kelas dalam proyek memiliki satu tanggung jawab saja, seperti operasi akses data untuk repository dan definisi model untuk kelas-kelas Car dan Product.

- Open/Closed Principle (OCP):

  mengkode ke interface (CarRepository dan ProductRepository), proyek terbuka untuk perluasan melalui penambahan implementasi baru sementara tertutup untuk modifikasi pada kode yang sudah ada.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<hr>

<!-- ABOUT THE PROJECT -->
<a name="benefits"></a>
## Benefits of applying SOLID principles and example

- Pemeliharaan:

  SRP seperti pada nomor sebelumnya membuat lebih mudah memahami, memperbarui, dan memelihara program. Sehingga pas kita mau buat fitur baru perlu ditambahkan ke CarRepository, kita dapat fokus hanya pada memodifikasi kelas tersebut tanpa memengaruhi bagian lain

- Fleksibilitas:

  implementasi interface dan mematuhi ISP memungkinkan untuk pertukaran implementasi dengan mudah. Misalnya, jika mekanisme penyimpanan data untuk Car perlu diubah, hanya implementasi CarRepository yang perlu dimodifikasi, sementara bagian lain dari tidak terpengaruh.

- Testabilitas:

  Mengiktui prinicple SRP dan pemisahan tanggung jawab, komponen-komponen individu dari sistem menjadi lebih mudah diuji. Misalnya, unit test dapat ditulis khusus untuk implementasi CarRepository atau ProductRepository tanpa perlu menguji seluruh sistem.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<hr>

<!-- ABOUT THE PROJECT -->
<a name="disadvantages"></a>
## Disadvantages if you do not apply SOLID principles to your project and example

- Duplikasi Kode:

  Jika kita tidak mengiktu principle SRP, program dapat menjadi bengkak dan berisi kode yang berlogika sama/duplikat. Misalnya, jika ada kode untuk ngakses data tapi tersebar di berbagai file lain daripada terpusat di repository, jadi redundant karena banyak serupa diulangi di banyak file lain.

- Keterikatan yang Ketat:

  kalau tidak mengikuti OCP dan DIP dapat menyebabkan dependent yang ketat antara file-file yang berbeda dari sistem. Misalnya, jika kelas-kelas langsung bergantung pada implementasi konkret daripada abstraksi, membuat perubahan pada satu bagian dari sistem mungkin memerlukan modifikasi pada beberapa bagian lain, sehingga jadi sulit di maintain.

- Kesulitan dalam Skalabilitas:

  tanpa mematuhi ISP, menambahkan fungsionalitas baru ke file-file yang sudah ada mungkin memerlukan modifikasi pada interface dan implementasinya, memengaruhi bagian lain dari sistem. Misalnya, jika sebuah kelas mengimplementasikan interface yang besar dengan banyak metode, menambahkan metode baru ke antarmuka tersebut mungkin memaksa semua kelas yang mengimplementasikannya untuk memberikan implementasi, bahkan jika mereka tidak membutuhkannya. Hal ini dapat menyebabkan perubahan kode yang tidak perlu dan potensi bug.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<hr>


</details>

<hr>
      <details>
      <summary><a href="#tugas-2">Tutorial / Module 4 | ⭐ TDD & RefactoringURL</a></summary>

<hr>
<hr>
<!-- #TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>: TABLE OF CONTENTS -->
<h3 align="center">Reflection TDD & RefactoringURL</h3>   

<a name="tugas-4"></a>
<details>
<summary>Table of Contents</summary>
<ol>
  <li>
    <a href="#TDD-flow">TDD flow is useful enough or not</a>
  </li>
  <li>
    <a href="#FIRST">successfully followed F.I.R.S.T. principle or not.</a>
  </li>
</ol>
</details>



<!-- ABOUT THE PROJECT -->
<a name="TDD-flow"></a>
> Reflect based on Percival (2017) proposed self-reflective questions (in “Principles and Best Practice of Testing” submodule, chapter “Evaluating Your Testing Objectives”), whether this TDD flow is useful enough for you or not. If not, explain things that you need to do next time you make more tests.

Menurut pandangan saya, pengembangan berbasis Test-Driven Development (TDD) sangat bermanfaat. Hal ini dikarenakan adanya

- Evaluasi Kebutuhan Pengujian: harus memastikan bahwa sistem telah sepenuhnya memahami kebutuhan pengujian sebelum mulai mengimplementasikan kode. membantu sekali dalam menentukan kasus uji yang tepat dan memastikan bahwa semua kasus uji yang diperlukan telah ditangani.
- Refleksi Terhadap Desain Kode: Dengan adanya ini dapat menghindari masalah yang mungkin ada dari segi prinsip-prinsip desain
- Penambahan Pengujian Unit: semua bagian kode tercakup oleh pengujian unit yang sesuai. Ini memastikan bahwa kodenya dapat dipercaya dan mudah untuk dipelihara.
- Integrasi dan Pengujian End-to-End: memastikan bahwa kode saya diuji secara menyeluruh melalui pengujian integrasi dan end-to-end supaya pasti sistemnya berfungsi dengan baik saat digabungkan.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<hr>

<a name="FIRST"></a>
> You have created unit tests in Tutorial. Now reflect whether your tests have successfully followed F.I.R.S.T. principle or not. If not, explain things that you need to do the next time you create more tests.


Pada kasus pengujian yang telah saya lakukan, saya akan menilai apakah mereka mengikuti prinsip F.I.R.S.T.:

- Fast (Cepat): Dalam tes yang udah saya buat, saya sudah memastikan bahwa mereka berjalan dengan cepat dan efisien, tanpa waktu yang berlebihan.
- Independent (Independen): Setiap tes sudah berdiri sendiri dan tidak bergantung pada hasil tes lainnya.
- Repeatable (Dapat diulang): tes saya dapat diulang dan memberikan hasil yang konsisten setiap kali dijalankan.
- Self-Validating (Memvalidasi diri): Dalam tes saya, hasilnya jelas dan mudah dipahami apakah tes tersebut lulus atau gagal.
- Timely (Tepat waktu): Saya tidak menunda pengujian dan sudah mengintegrasikannya ke dalam siklus pengembangan secara teratur.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<hr>


</details>



<hr>
      <details>
      <summary><a href="#tugas-2">Tutorial / Module 5 | ⭐ Java Profiling</a></summary>

<hr>
<hr>
<!-- #TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>: TABLE OF CONTENTS -->
<h3 align="center">Tutorial / Module 5 | ⭐ Java Profiling</h3>   

<a name="tugas-9"></a>
<details>
<summary>Table of Contents</summary>
<ol>
  <li>
    <a href="#optimize">Screenshoot task and Conclusion</a>
  </li>

  <li>
    <a href="#jmeter-vs-profiler">What is the difference between the approach of performance testing with JMeter and profiling with IntelliJ Profiler in the context of optimizing application performance?</a>
  </li>
  <li>
    <a href="#profiling-process">How does the profiling process help you in identifying and understanding the weak points in your application?</a>
  </li>
  <li>
    <a href="#bottlenecks">Do you think IntelliJ Profiler is effective in assisting you to analyze and identify bottlenecks in your application code?</a>
  </li>
  <li>
    <a href="#performance-testing">What are the main challenges you face when conducting performance testing and profiling, and how do you overcome these challenges?</a>
  </li>
  <li>
    <a href="#benefits-profiling">What are the main benefits you gain from using IntelliJ Profiler for profiling your application code?</a>
  </li>

  <li>
    <a href="#intellij-profiler">How do you handle situations where the results from profiling with Inte	lliJ Profiler are not entirely consistent with findings from performance testing using JMeter?
</a>
  </li>

  <li>
    <a href="#strategy-optimize">What strategies do you implement in optimizing application code after analyzing results from performance testing and profiling? How do you ensure the changes you make do not affect the application's functionality?

</a>
  </li>

</ol>
</details>


<hr>
<!-- ABOUT THE PROJECT -->

<a name="optimize"></a>
## Screenshoot task and Conclusion

JMeter Resuls in table for all_student
![JMeter Resuls in table for all_student](screenshoot\test_all_student.png)
after optimization
![after optimization](screenshoot\optimize_all_student.png)

JMeter Resuls in table for all_student_name
![JMeter Resuls in table for all_student_name](screenshoot\test_all_student_name.png)
after optimization
![after optimization](screenshoot\optimize_all_student_name.png)

JMeter Resuls in table for highest_gpa
![JMeter Resuls in table for highest_gpa](screenshoot\test_highest_gpa.png)
after optimization
![after optimization](screenshoot\optimize_highest_gpa.png)

Test log for all_student
![Test log for all_student](screenshoot\log_all_student.png)
Test log for all_student_name
![Test log for all_student_name](screenshoot\log_all_student_name.png)
Test log for highest_gpa
![Test log for highest_gpa](screenshoot\log_highest_gpa.png)


**Kita dapat melihat perbedaan pada sample time(ms) yang menunjukkan waktu yang diperlukan dalam menjalankan program tersebut. Pada hal tersebut terdapat **peningkatan signifikan dalam kinerja aplikasi setelah menerapkan optimisasi yang diidentifikasi melalui profiling melalui intellij dan optimasi**. Waktu respon rata-rata menurun dari rata-rata 160000 ms pada all_student menjadi 3000 ms pada all_student, hal ini berlaku pada kedua test lainnya all_student_name dan highest_gpa (walaupun tidak teralu terlihat tetapi jika banyak data akan terlihat total costnya), menunjukkan waktu respon yang lebih cepat bagi pengguna.**

**Hasil ini memvalidasi efektivitas upaya optimisasi dan menyoroti pentingnya profiling dan performance testing dalam mengidentifikasi dan menangani bottleneck kinerja dalam aplikasi.**




<p align="right">(<a href="#readme-top">back to top</a>)</p>

<hr>

<!-- ABOUT THE PROJECT -->
<a name="jmeter-vs-profiler"></a>
## What is the difference between the approach of performance testing with JMeter and profiling with IntelliJ Profiler in the context of optimizing application performance?

Kalau pengujian kinerja dengan JMeter bertujuan untuk mengukur kinerja aplikasi di bawah beban tertentu, sedangkan IntelliJ Profiler bertujuan untuk menganalisis detail penggunaan sumber daya dan identifikasi titik-titik panas dalam kode aplikasi untuk memperbaiki kinerja secara spesifik contohnya melalui flame graph di tutorial. JMeter digunakan untuk pengujian beban dan skala aplikasi, sementara Profiler membantu dalam mengidentifikasi dan memperbaiki masalah kinerja di tingkat kode.


<p align="right">(<a href="#readme-top">back to top</a>)</p>

<hr>
<!-- ABOUT THE PROJECT -->

<a name="jmeter-vs-profiler"></a>
## How does the profiling process help you in identifying and understanding the weak points in your application?

Proses profiling membantu dalam mengidentifikasi dan memahami titik-titik lemah (cost yang mahal) dalam aplikasi dengan menganalisis penggunaan sumber daya seperti CPU, memori, dan time di berbagai bagian program. Dengan profiling, saya dapat melihat di mana aplikasi menghabiskan waktu dan sumber daya, membantu saya fokus pada area-area yang perlu dioptimalkan untuk meningkatkan performance aplikasi secara keseluruhan.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<hr>

<hr>
<!-- ABOUT THE PROJECT -->

<a name="jmeter-vs-profiler"></a>
## Do you think IntelliJ Profiler is effective in assisting you to analyze and identify bottlenecks in your application code?

Iya, IntelliJ Profiler efektif dalam membantu menganalisis dan mengidentifikasi titik-titik bottleneck dalam kode aplikasi karena Profiler menyediakan alat yang kuat untuk memantau penggunaan sumber daya seperti CPU, memori, dan thread untuk melihat mana yang perlu ditingkatkan. Dengan visualisasi yang jelas dan data yang disajikan dengan baik, Profiler memungkinkan saya untuk mengidentifikasi bagian kode yang memakan waktu atau menggunakan sumber daya secara berlebihan dengan cepat. Sesuai dengan alasan pada nomor sebelumnya.


<p align="right">(<a href="#readme-top">back to top</a>)</p>

<hr>

<hr>
<!-- ABOUT THE PROJECT -->

<a name="jmeter-vs-profiler"></a>
## What are the main challenges you face when conducting performance testing and profiling, and how do you overcome these challenges?

Tantangan yang dihadapi saat mau performance testing dan profiling tentunya terletak pada pemahaman yang diperlukan untuk melakukan testing tersebut, setup/persiapannya membutuhkan pemahaman materi yang mendalam serta ketika melakukan testing memerlukan perhatian terhadap apa yang dites. Selain itu juga, kita mperlu fokus pada metode atau function yang di test untuk mengetahui performancenya apakah bisa ditingkatkan atau sudah efisien. Dalam mengidentifikasi hal tersebut dan melakukan improvement terhadap performancenya sangatlah sulit karena memerlukan keterampilan programming yang baik dalam memahami function dari program serta pengetahuan luas dalam improving algoritmanya.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<hr>

<hr>
<!-- ABOUT THE PROJECT -->

<a name="jmeter-vs-profiler"></a>
## What are the main benefits you gain from using IntelliJ Profiler for profiling your application code?

- Memberikan visualisasi yang jelas tentang penggunaan sumber daya seperti CPU, memori, dan thread.
- Membantu mengidentifikasi titik-titik bottleneck dalam kode aplikasi yang dapat mempengaruhi kinerja secara signifikan.
- Memungkinkan pemantauan real-time selama eksekusi aplikasi, memudahkan deteksi masalah secara cepat.
- Menyediakan analisis detail pada level metode dan garis kode, membantu saya dalam memahami sumber masalah secara spesifik.
- Terintegrasi dengan lingkungan pengembangan IntelliJ IDEA, mempermudah penggunaan dan kolaborasi antara profilasi dan pengembangan kode.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<hr>

<hr>
<!-- ABOUT THE PROJECT -->

<a name="jmeter-vs-profiler"></a>
## How do you handle situations where the results from profiling with IntelliJ Profiler are not entirely consistent with findings from performance testing using JMeter?

Ketika hasil dari profilasi dengan IntelliJ Profiler tidak sepenuhnya konsisten dengan temuan dari pengujian kinerja menggunakan JMeter, kita dapat melakukan langkah-langkah berikut:

- Mengidentifikasi perbedaan antara pengujian kinerja dan profilasi untuk memahami penyebab ketidaksesuaian.
- Melakukan replikasi pengujian untuk memastikan konsistensi hasil antara kedua pendekatan.
- Menggabungkan temuan dari profilasi dan pengujian kinerja untuk mendapatkan pemahaman yang lebih holistik tentang kinerja aplikasi.
- Melakukan pengujian ulang dengan pengaturan yang berbeda untuk memverifikasi hasil dan mencari solusi yang konsisten.

"Addressing these common causes requires a comprehensive understanding of Java application behavior, diligent code profiling, and optimization strategies to ensure applications run efficiently, scale effectively, and deliver a seamless user experience." - Slide modul

Dengan pendekatan yang cermat dan analisis yang teliti, kita dapat mengatasi perbedaan hasil antara profilasi dan pengujian kinerja untuk meningkatkan kinerja aplikasi secara keseluruhan.


<p align="right">(<a href="#readme-top">back to top</a>)</p>

<hr>

<hr>
<!-- ABOUT THE PROJECT -->

<a name="jmeter-vs-profiler"></a>
## What strategies do you implement in optimizing application code after analyzing results from performance testing and profiling? How do you ensure the changes you make do not affect the application's functionality?

Strategi yang dilakukan untuk mmengoptimize kode apliksai setelah mengalaisis hasil performance testing dan profiling:

- Mengidentifikasi dan memprioritaskan area yang perlu dioptimalkan berdasarkan temuan dari pengujian kinerja dan profilasi. Dalam intellij profiler ditunjukkan flame graph, dan juga ada icon flame pada program yang membutuhkan waktu lambat
- Melakukan perbaikan kode yang spesifik untuk mengatasi titik-titik bottleneck yang diidentifikasi. Ini mungkin meliputi pengoptimalan algoritma, peningkatan efisiensi, atau penghapusan panggilan ke database yang tidak efisien. Dalam pengoptimalan algoritma, kita perlu meluaskan pengetahuan kita, misalkan pada contoh modul ini saya menggunakan StringBuilder dan juga map serta stream yang dapat meningkatkan efisiensi.
- Melakukan pengujian ulang setelah menerapkan perubahan untuk memastikan bahwa perubahan tersebut benar-benar meningkatkan kinerja aplikasi.
- Memastikan bahwa perubahan yang dilakukan tidak memengaruhi fungsionalitas aplikasi. Ini dapat dicapai dengan melakukan pengujian fungsional untuk memastikan bahwa aplikasi masih berperilaku seperti yang diharapkan setelah diterapkan perubahan kinerja.
- Menerapkan siklus iterasi di mana perubahan dianalisis, diuji, dan diterapkan secara bertahap untuk terus meningkatkan kinerja aplikasi tanpa mengorbankan fungsionalitas. Sering kali yang kita lakukan dapat dioptimalisasi lebih efisien lagi, sehingga perlu melakukan iterasi berulang-ulang.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<hr>



</details>

<hr>
      <details>
      <summary><a href="#tugas-2">Tutorial / Module ? | ⭐ ?</a></summary>

<hr>
<hr>
<!-- #TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>:TODO:>>>: TABLE OF CONTENTS -->
<h3 align="center">Tugas 9: Integrasi Layanan Web Django dengan Aplikasi Flutter</h3>   

<a name="tugas-9"></a>
<details>
<summary>Table of Contents</summary>
<ol>
  <li>
    <a href="#pengambilan-json">pengambilan data JSON tanpa membuat model terlebih dahulu</a>
  </li>
  <li>
    <a href="#cookie-request">fungsi dari CookieRequest dan mengapa instance CookieRequest perlu untuk dibagikan ke semua komponen di aplikasi Flutter</a>
  </li>
  <li>
    <a href="#mekanisme-fetch">mekanisme pengambilan data dari JSON hingga dapat ditampilkan pada Flutter</a>
  </li>
  <li>
    <a href="#mekanisme-auth">mekanisme autentikasi dari input data akun pada Flutter ke Django hingga selesainya proses autentikasi oleh Django dan tampilnya menu pada Flutter.</a>
  </li>
  <li>
    <a href="#widget-dipakai">widget yang kamu dipakai pada tugas ini</a>
  </li>

  <li>
    <a href="#checklist9">implementasi checklist</a>
  </li>

</ol>
</details>



<!-- ABOUT THE PROJECT -->
<a name="pengambilan-json"></a>
## pengambilan data JSON tanpa membuat model terlebih dahulu

bisa tetapi prosedur yang perlu dilakukan dalam memparsing

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<hr>


</details>


  </ol>
</details>
