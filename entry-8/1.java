    <script>
        function aa(){
            console.log(123)
            const input = document.getElementById('userInput').value.trim();
            const resultDiv = document.getElementById('result');
            document.getElementById('userInput').value = '';
            resultDiv.innerHTML = '';
            if (input.toLowerCase() === 'sheng') {
                resultDiv.innerHTML += '<h2>Congratulations, you got it right.</h2>';
                resultDiv.innerHTML += '<p>It is one of the oldest Chinese instruments, with images depicting its kind dating back to 1100 BCE, and there are original instruments from the Han dynasty that are preserved in museums today. Traditionally, the sheng has been used as an accompaniment instrument for solo suona or dizi performances. It is one of the main instruments in kunqu and some other forms of Chinese opera. Traditional small ensembles also make use of the sheng, such as the wind and percussion ensembles in northern China. In the modern large Chinese orchestra, it is used for both melody and accompaniment.</p>';
            } else if (input.toLowerCase() === 'bianzhong') {
                resultDiv.innerHTML += '<h2>Sorry, you got the answer wrong.</h2>';
                resultDiv.innerHTML += "<p>Bianzhong (編鐘) is an ancient Chinese musical instrument consisting of a set of bronze bells, played melodically. China is the earliest country to manufacture and use musical chimes. They are also called chime bells. These sets of chime bells were used as polyphonic musical instruments and some of these bells have been dated at between 2,000 to 3,600 years old. They were hung in a wooden frame and struck with a mallet. Using a wooden hammer and a rod to beat the bronze bell can make different pitch. Along with the stone chimes called bianqing, they were an important instrument in China's ritual and court music going back to ancient times.</p>";
            }
            
        }
    </script>