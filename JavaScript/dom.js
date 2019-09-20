let a=document.getElementById('demo');
        console.log(a);
        let b=document.getElementsByClassName('a');
        console.log(b);
        let c=document.getElementsByTagName('p');
        console.log(c);
        let d=document.getElementsByName('h1');
        console.log(d);
        let e= document.querySelector('#demo');//only for query selector use. or #
        console.log(e);
        let f=document.querySelectorAll('.a');//only for query selector use . or #
        console.log(f);
        let g= document.createElement('button');
        g.textContent = 'Click Me';
        console.log(g);
        document.body.appendChild(g);
        let h=document.getElementById('pqr');
        h.classList='add add1';

        document.getElementById('table').innerHTML=`<table>
        <tr>
        <td>Name</td>
        <td>Age</td>
        </tr>
        <tr>
        <td>John</td>
        <td>14</td>
        </tr>
        <tr>
        <td>Dinga</td>
        <td>20</td>
        </tr>
        <tr>
        <td>Sundari</td>
        <td>22</td>
        </tr>
        </table>`;
        
        tableEle = document.createElement('table');
        tr1=document.createElement('tr');
        trd1=document.createElement('td');
        trd1.textContent='Name';
        trd2=document.createElement('td');
        trd2.textContent='Age';
        tr1.appendChild(trd1);
        tr1.appendChild(trd2);
        tableEle.appendChild(tr1);
        trd1.style.border='1px solid black';
        trd2.style.border='1px solid black';

        tr2=document.createElement('tr');
        trd3=document.createElement('td');
        trd3.textContent='John';
        trd4=document.createElement('td');
        trd4.textContent='20';
        tr2.appendChild(trd3);
        tr2.appendChild(trd4);
        tableEle.appendChild(tr2);
        trd3.style.border='1px solid black';
        trd4.style.border='1px solid black';

        tr3=document.createElement('tr');
        trd5=document.createElement('td');
        trd5.textContent='Dinga';
        trd6=document.createElement('td');
        trd6.textContent='22';
        tr3.appendChild(trd5);
        tr3.appendChild(trd6);
        tableEle.appendChild(tr3);
        trd5.style.border='1px solid black';
        trd6.style.border='1px solid black';

        document.body.appendChild(tableEle);
        tableEle.style.border='2px solid black';

        let pEleData=document.getElementById('demo1');
        // pEleData.style.color = 'Blue';
       // pEleData.className='a';
       pEleData.classList='blue fonts';